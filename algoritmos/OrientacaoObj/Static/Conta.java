package Static;

import java.text.DecimalFormat;

import Orientacao_a_Objetos.AgenciaBanco;

public class Conta {
	//para utilizar onde haverá valores de saldo,limite transferencia e etc.
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private int idConta;
	private String numeroConta;
	private double saldoConta;
	private double limiteConta = 100.00d;
	private AgenciaBanco numero;
	public static int contador = 0;
	
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	public double getLimiteConta() {
		return limiteConta;
	}
	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}
	public AgenciaBanco getNumero() {
		return numero;
	}
	public void setNumero(AgenciaBanco numero) {
		this.numero = numero;
	}
	
	//construtor 
	public Conta() {
		Conta.contador++;
		this.idConta = Conta.contador;
	}
	//metodo
	public void deposita (double valor){
		this.saldoConta += valor;
	}
	//metodo
	public void saca (double valor){
		this.saldoConta -= valor;
	}
	//metodo imprime extrato da conta
	public  String extrato () {
		String extrato = "";
		extrato += "\n Numero da Conta: "+this.numeroConta;
		extrato += "\n Saldo da conta: "+df.format(this.saldoConta)+"R$";
		extrato += "\n Limite da conta: "+df.format(this.limiteConta)+"R$";
		extrato += "\n Numero da agência: "+this.numero.numeroAgencia;
		return extrato;
	}
	//metodo
	public double saldoDisponivel(){
		return this.saldoConta + this.limiteConta;
	}
	//Construtor para inserir os dados de numero e saldo da conta
	public Conta(String numero, double saldo){
		Conta.contador++;
		this.numeroConta = numero;
		this.saldoConta = saldo;
	}
	//construtor para  fazer a transferencia entre contas
	public void transfere(Conta destino, double valor) {
		this.saldoConta -= valor;
		destino.saldoConta += valor;
	}
	//metodo para zerar o contador, primeiro o metodo mostra quantas contas existem e depois aplica a sua função que é zerar o contador.
	public static void zerarContador() {
		System.out.println("Qtd de contas criadas = " + Conta.contador);
		Conta.contador = 0;
	}

}
