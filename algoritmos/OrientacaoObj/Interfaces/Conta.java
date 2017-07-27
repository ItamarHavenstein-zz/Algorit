/**
 * Este pacote é responsável pela classe da conta
 */
package Interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Esta classe é responsável pelos atributos da conta
 * @author Noturno
 *
 */
public class Conta {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM   hh:mm:ss");
	/**
	 * este são os atributos da conta
	 * private String nome : este recebe o nome
	 * private String numeroConta : este recebe o numero da conta
	 * private Agencia agencia: este recebe a agencia 
	 */
	private String nome;
	private String numeroConta;
	private Agencia agencia;
	
	/**
	 * este construtor é responsável pela conta
	 * @param nome: este parametro é responsavel pelo nome
	 * @param numeroConta: este parametro é responsável pelo numero da conta
	 * @param agencia: este parametro é responsavel pelo numero da agencia
	 */
	public Conta(String nome, String numeroConta, Agencia agencia) {
		super();
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}
	
	public Conta() {
		super();
	}

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
