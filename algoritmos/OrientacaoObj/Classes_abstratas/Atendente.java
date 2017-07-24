package Classes_abstratas;

import java.text.DecimalFormat;

public class Atendente extends Funcionario {
	DecimalFormat df = new DecimalFormat();

	private String ramal;
	private double salario;

	//metodo padrao
	public Atendente(){
		
	}
	//construtor da classe
	public Atendente(String nome, int codigo, String ramal, double salario){
		this.setNome(nome);
		this.setCodigo(codigo);
		this.setRamal(ramal);
		this.setSalario(salario);
	}
	@Override
	public void informacoes() {
		System.out.println("Informações do Atendente");
		System.out.println("Nome: "+this.getNome()+"\nCodigo: "+this.getCodigo()+"\nRamal: "+this.getRamal()+
				"\nSalario: "+df.format(getSalario())+"R$");
		
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

}
