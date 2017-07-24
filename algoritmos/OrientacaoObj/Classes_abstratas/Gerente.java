package Classes_abstratas;

import java.text.DecimalFormat;

public class Gerente extends Funcionario{
	DecimalFormat df = new DecimalFormat();

	private String senha;
	private double salario;
	
	//metodo padrao
	public Gerente(){
		
	}
	//construtor da classe
	public Gerente(String nome, int codigo, String Senha, double salario){
		this.setNome(nome);
		this.setCodigo(codigo);
		this.setSenha(Senha);
		this.setSalario(salario);
	}
	@Override
	public void informacoes() {
		System.out.println("INformações do Gerente");
		System.out.println("Nome: "+this.getNome()+"\nCodigo: "+this.getCodigo()+"\nSenha: "+this.getSenha()+
				"\nSalario: "+df.format(getSalario())+"R$");
		
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
	
}
