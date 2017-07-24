package Interfaces;

public class Conta {

	private String nome;
	private String numeroConta;
	private Agencia agencia;
	
	
	public String geradordeExtrato() {
		String Extrato = "";
		Extrato ="Nome do Cliente: "+this.getNome();
		Extrato ="\nNumero Da Conta: "+this.getNumeroConta();
		Extrato = "\nNumero da Agencia: "+this.getAgencia();
	    return Extrato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Agencia getAgencia() {
		return agencia;
	}

}
