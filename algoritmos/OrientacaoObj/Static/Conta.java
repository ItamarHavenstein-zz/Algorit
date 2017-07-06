package Static;

import java.text.DecimalFormat;

import Orientacao_a_Objetos.AgenciaBanco;

public class Conta {
	//para utilizar onde haverá valores de saldo,limite transferencia e etc.
	DecimalFormat df = new DecimalFormat("#0.00");
	
	int idConta;
	String numeroConta;
	double saldoConta;
	double limiteConta = 100.00d;
	AgenciaBanco numero;
	
	public static int contador = 0;
	
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
	//metodo
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
	//Construtor
	public Conta(String numero, double saldo){
		this.numeroConta = numero;
		this.saldoConta = saldo;
	}
	//construtor para  fazer a transferencia entre contas
	public void transfere(Conta destino, double valor) {
		this.saldoConta -= valor;
		destino.saldoConta += valor;
	}
	public static void zerarContador() {
		System.out.println("Qtd de contas criadas = " + Conta.contador);
		Conta.contador = 0;
	}

}
