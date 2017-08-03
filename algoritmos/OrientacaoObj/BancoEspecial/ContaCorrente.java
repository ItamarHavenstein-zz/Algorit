package BancoEspecial;

public class ContaCorrente extends Cliente implements Conta {

	private double saldo;
	private double limite;
	private String numConta;

	
	public ContaCorrente(String nome, String rg, String cidade, double saldo, double limite, String numConta) {
		super(nome, rg, cidade);
		this.saldo = saldo;
		this.limite = limite;
		this.numConta = numConta;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
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

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= (valor *((5/100d)+1) );
	}

}
