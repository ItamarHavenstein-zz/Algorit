package JavaPrivate;

import java.text.DecimalFormat;

public class Conta {

	//para utilizar onde haverá valores de saldo,limite transferencia e etc.
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String numeroConta;
	private double saldoConta;
	private double limiteConta = 100.00d;
    AgenciaBanco numero;

	
	
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
	//metodo
	public void deposita (double valor){
		this.saldoConta += valor;
	}
	//metodo
	public void saca (double valor){
		this.saldoConta -= valor;
	}
	//metodo
	public  String extrato () {
		String extrato = "";
		extrato += "\n Numero da Conta: "+this.numeroConta;
		extrato += "\n Saldo da conta: "+df.format(this.saldoConta)+"R$";
		extrato += "\n Limite da conta: "+df.format(this.limiteConta)+"R$";
		extrato += "\n Numero da agência: "+this.numero.getNumeroAgencia();
		return extrato;
	}
	//metodo
	public double saldoDisponivel(){
		return this.saldoConta + this.limiteConta;
	}
	//Construtor
	public Conta(String numero, double saldo){
		this.numeroConta = numero;
		this.saldoConta = saldo;
	}
	//metodo padrao
	public Conta(){
	}
	//construtor para  fazer a transferencia entre contas
	public void transfere(Conta destino, double valor) {
		this.saldoConta -= valor;
		destino.saldoConta += valor;
	}
}
