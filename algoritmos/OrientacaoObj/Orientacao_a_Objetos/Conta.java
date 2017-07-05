package Orientacao_a_Objetos;

import java.text.DecimalFormat;

public class Conta {
	//para utilizar onde haverá valores de saldo,limite transferencia e etc.
	DecimalFormat df = new DecimalFormat("#0.00");
	
	String numeroConta;
	double saldoConta;
	double limiteConta = 100.00d;
	AgenciaBanco numero;
	
	public void deposita (double valor){
		this.saldoConta += valor;
	}
	public void saca (double valor){
		this.saldoConta -= valor;
	}
	//tirar duvida neste metodo para chamar as informações.
	public  String extrato () {
		String extrato = "";
		extrato += "\n Numero da Conta: "+this.numeroConta;
		extrato += "\n Saldo da conta: "+df.format(this.saldoConta);
		extrato += "\n Limite da conta: "+df.format(this.limiteConta);
		extrato += "\n Numero da agência: "+this.numero.numeroAgencia;
		return extrato;
	}
	public double saldoDisponivel(){
		return this.saldoConta + this.limiteConta;
		
	}
}
