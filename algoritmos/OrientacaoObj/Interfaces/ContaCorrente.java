package Interfaces;

import java.text.DecimalFormat;

public class ContaCorrente extends Conta implements Banco{
	DecimalFormat df = new DecimalFormat("#,##0.00R$");

	private double saldo;
	private double limite;
	private double encargos;
	private double valorDep;
	private double valorSac;
		
	
	public double getValorSac() {
		return valorSac;
	}

	public void setValorSac(double valorSac) {
		this.valorSac = valorSac;
	}

	public double getValorDep() {
		return valorDep;
	}

	public void setValorDep(double valorDep) {
		this.valorDep = valorDep;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getEncargos() {
		return encargos;
	}

	public void setEncargos(double encargos) {
		this.encargos = encargos;
	}

	@Override
	public void deposita(double valor) {
		this.setValorDep(valor);
		this.saldo += valor - getEncargos();
		System.out.println("Valor Depositado "+df.format(getValorDep())+"\nEncargo da Conta: "+df.format(getEncargos())
		+"\nSaldo: "+df.format(getSaldo()));
				
	}

	@Override
	public void saca(double valor){		
		this.setValorSac(valor);
		this.saldo -= valor + getEncargos();
		System.out.println("Valor Sacado: "+df.format(getValorSac())+"\nEncargos da Conta: "+df.format(getEncargos())
		+"\nSaldo: "+df.format(getSaldo()));
	}	
	@Override
	public void gerarExtrato() {
		System.out.println(" Conta Corrente ");
		super.gerarExtrato();
		System.out.println("Saldo: "+df.format(getSaldo()));
		System.out.println("Limite: "+df.format(getLimite()));
		System.out.println("Encargos da Conta: "+df.format(getEncargos()));
	}
	
}
