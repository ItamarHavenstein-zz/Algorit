package CollectionsJava;

public class ContaCorrente extends Cliente{

	private double saldo;
	private double limite;
	
	public ContaCorrente(String nome, String cpf, String numConta, double saldo, double limite) {
		super(nome, cpf, numConta);
		this.saldo = saldo;
		this.limite = limite;
	}
	@Override
	public String gerarExtrato() {
		return super.gerarExtrato()+" Saldo: "+this.getSaldo()+" Limite: "+this.getLimite();
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
	
}
