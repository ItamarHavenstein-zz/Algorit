package Classes_abstratas;

import java.text.DecimalFormat;

public class Atendente extends Funcionario {
	DecimalFormat df = new DecimalFormat("#,##0.00");

	private String ramal;
	private double salario;
	private double bonus;
	private double bonifica;
	

	//metodo padrao
	public Atendente(){
		
	}
	//construtor da classe
	public Atendente(String nome, int codigo, String ramal, double salario,double bonus){
		this.setNome(nome);
		this.setCodigo(codigo);
		this.setRamal(ramal);
		this.setSalario(salario);
		this.setBonus(bonus);
	}
	@Override
	public void informacoes() {
		System.out.println("Informações do Atendente");
		System.out.println("Nome: "+this.getNome()+"\nCodigo: "+this.getCodigo()+"\nRamal: "+this.getRamal()+
				"\nSalario: "+df.format(getSalario())+"R$"+"\nBonificação de "+df.format(this.getBonifica())+"R$"+
				"\nNovo Salário: "+df.format(getBonifica()+getSalario())+"R$");
		
	}
	@Override
	public void bonificacao() {
		this.setBonifica((salario *((bonus/100d)+1))-salario);
		
		
	}
	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonifica() {
		return bonifica;
	}
	public void setBonifica(double bonifica) {
		this.bonifica = bonifica;
	}

}
