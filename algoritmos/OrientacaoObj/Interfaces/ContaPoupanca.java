/**
 * Este pacote é responsável pelas classes de uma conta
 */
package Interfaces;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Esta classe é responsável pela conta poupança
 * @author Noturno
 *
 */
public  class ContaPoupanca extends Conta implements Banco{
	DecimalFormat df = new DecimalFormat("#,##0.00R$");
	SimpleDateFormat sdf = new SimpleDateFormat("MM");

	/**
	 * esta classe é responsável pelos atributos saldo, juros, valordep e valorsac
	 */
	private double saldo;
	private double juros;
	private double valorDep;
	private double valorSac;
		
	/**
	 * este construtor é responsável pela conta poupança
	 * @param nome: este parametro é responsável pelo nome
	 * @param numeroConta: este parametro é responsável pelo numero da conta
	 * @param agencia: este parametro é responsável pelo numero da agencia
	 * @param saldo: este parametro é responsavel pelo saldo da conta
	 * @param juros: este parametro é responsavel pelo juros da conta
	 */
	public ContaPoupanca(String nome, String numeroConta, Agencia agencia, double saldo, double juros) {
		super(nome, numeroConta, agencia);
		this.saldo = saldo;
		this.juros = juros;
	}

	
	public ContaPoupanca() {
		super();
	}


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
