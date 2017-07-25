package Interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM   hh:mm:ss");
	
	private String nome;
	private String numeroConta;
	private Agencia agencia;
	
	public Agencia getAgencia() {
		return agencia;
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
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public void gerarExtrato() {
		System.out.println("Agencia: "+getAgencia().getAgencia());
		Date agora = new Date();
		System.out.println(sdf.format(agora));
		System.out.println("Nome do Cliente: "+getNome());		
		System.out.println("Numero da Conta: "+getNumeroConta());
	}
}
