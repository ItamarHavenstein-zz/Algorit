/**
 * este pacote é responsável pelas classes de uma conta
 */
package Interfaces;

import java.text.DecimalFormat;
/**
 * Esta classe é responsável pela conta corrente
 * @author Noturno
 *
 */
public class ContaCorrente extends Conta implements Banco{
	DecimalFormat df = new DecimalFormat("#,##0.00R$");
	/**
	 * esta classe  é responsável pelos atributos Saldo, Limite, Encargos, Valordep, Valorsac
	 * 
	 */
	private double saldo;
	private double limite;
	private double encargos;
	private double valorDep;
	private double valorSac;
		
	/**
	 * Este construtor é responsável pela conta corrente
	 * @param nome: este parametro é responsável pelo nome
	 * @param numeroConta: este parametro é responsável pelo numero da conta
	 * @param agencia:  este parametro é responsável pelo numero da agencia
	 * @param saldo: este parametro é responsável pelo saldo da conta
	 * @param limite: este parametro é responsável pelo limite da conta
	 * @param encargos: este parametro é responsável pelos encargos da conta
	 */
	public ContaCorrente(String nome, String numeroConta, Agencia agencia, double saldo, double limite,
			double encargos) {
		super(nome, numeroConta, agencia);
		this.saldo = saldo;
		this.limite = limite;
		this.encargos = encargos;
	}
	
	public ContaCorrente() {
		super();
	}

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
