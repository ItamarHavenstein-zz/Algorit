package Classes_abstratas;

import java.text.DecimalFormat;

public class Gerente extends Funcionario{
	DecimalFormat df = new DecimalFormat("#,##0.00");
	

	private String senha;
	private double salario;
	private double bonus;
	private double bonifica;
	
	
	//metodo padrao
	public Gerente(){
		
	}
	//construtor da classe
	public Gerente(String nome, int codigo, String Senha, double salario, double bonus){
		this.setNome(nome);
		this.setCodigo(codigo);
		this.setSenha(Senha);
		this.setSalario(salario);
		this.setBonus(bonus);
	}
	@Override
	public void informacoes() {
		System.out.println("INformações do Gerente");
		System.out.println("Nome: "+this.getNome()+"\nCodigo: "+this.getCodigo()+"\nSenha: "+this.getSenha()+
				"\nSalario: "+df.format(getSalario())+"R$"+"\nBonificação de "+df.format(this.getBonifica())+
				"\nNovo Salário: "+df.format(getBonifica()+getSalario())+"R$");
		
	}
	@Override
	public void bonificacao() {
		this.bonifica = salario * ((bonus/100d)+1);
		this.bonifica =  bonifica - salario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
