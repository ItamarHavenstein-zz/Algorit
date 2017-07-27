package Classes_abstratas;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Contas {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
	DecimalFormat df = new DecimalFormat();

	private double saldoP;
	private double juros;

	public ContaPoupanca(String numeroConta, String nome, double saldoP, double juros) {
		super(numeroConta, nome);
		this.saldoP = saldoP;
		this.juros = juros;
	}

	@Override
	public void imprimiExtratoDetalhado() {
		System.out.println("Extrato de Conta Poupança");
		Date agora = new Date();
		System.out.println("Data " + sdf.format(agora));
		System.out.println("Nome: " + this.getNome());
		System.out.println("Saldo: " + df.format(this.getSaldoP()));

	}

	public double getSaldoP() {
		return saldoP;
	}

	public void setSaldoP(double saldoP) {
		this.saldoP = saldoP;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public void deposita(double valor) {
		if (valor <= 0) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		} else {
			this.saldoP += valor;
		}
	}
	public void saca(double valor)throws Exception{
		if(valor <= 0){
			throw new Exception ("O saque precisa ser maior que Zero");
		}else{
			this.saldoP -= valor;
		}
	}

}
