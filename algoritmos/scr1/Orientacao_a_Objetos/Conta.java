package Orientacao_a_Objetos;

public class Conta {
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
	public  String extrato () {
		String extrato = "";
		extrato += "numero da Conta: "+this.numero;
		extrato += "saldo da conta: "+this.saldoConta;
		extrato += "limite da conta: "+this.limiteConta;
		extrato += "numero da agencia: "+this.numero;
		return extrato;
	}
	public double saldoDisponivel(){
		return this.saldoConta + this.limiteConta;
		
	}
}
