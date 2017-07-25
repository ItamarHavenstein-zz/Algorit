package Interfaces;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class ContaPoupanca extends Conta implements Banco{
	DecimalFormat df = new DecimalFormat("#,##0.00R$");
	SimpleDateFormat sdf = new SimpleDateFormat("MM");

	
	private double saldo;
	private double juros;
	private double valorDep;
	private double valorSac;
		
	
	public double getValorDep() {
		return valorDep;
	}

	public void setValorDep(double valorDep) {
		this.valorDep = valorDep;
	}

	public double getValorSac() {
		return valorSac;
	}

	public void setValorSac(double valorSac) {
		this.valorSac = valorSac;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	@Override
	public void deposita(double valor) {
		this.setValorDep(valor);
		this.saldo += valor;
		System.out.println("Valor Depositado "+df.format(getValorDep())+"\nSaldo: "+df.format(getSaldo()));
	}

	@Override
	public void saca(double valor) {
		this.setValorSac(valor);
		this.saldo -= valor;
		System.out.println("Valor Sacado: "+df.format(getValorSac())+"\nSaldo: "+df.format(getSaldo()));
	}
	@Override
	public void gerarExtrato() {
		System.out.println(" Conta Poupança ");
		super.gerarExtrato();
		Date mes = new Date();
		System.out.println("Saldo: "+df.format(getSaldo()));
		System.out.println("Juros do mês "+sdf.format(mes) +" : "+getJuros()+"%");		
	}
	public void juros(){
		this.saldo = saldo*((juros/100)+1);
		double taxa;
	    taxa = (saldo*((juros/100)+1)) - saldo;
		System.out.println("Juros "+df.format(taxa)+"\nSaldo com Juros: "+df.format(getSaldo()));
	}
}
