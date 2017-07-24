package Interfaces;

public class ContaCorrente extends Conta implements Banco{

	private double saldo;
	private double limite;
	private double encargos;
	
	public ContaCorrente(String nome, String numConta, double saldo, double limite, double encargos){
		this.setNome(nome);
		this.setNumeroConta(numConta);
		this.setSaldo(saldo);
		this.setLimite(limite);
		this.setEncargos(encargos);
	}
	@Override
	public String geradordeExtrato() {
		return super.geradordeExtrato()+"\nSaldo da Conta Corrente: "+this.getSaldo()+
				"\nLimite da Conta: "+this.getLimite()+"\nEncargos da Conta: "+this.getEncargos();
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		
	}

}
