package CollectionsJava;

public class ContaPoupanca extends Cliente{

	private double saldo;
	private double juros;
	
	public ContaPoupanca(String nome, String cpf, String numConta, double saldo, double juros) {
		super(nome, cpf, numConta);
		this.saldo = saldo;
		this.juros = juros;
	}
	@Override
	public String gerarExtrato() {
		return super.gerarExtrato()+" Saldo: "+this.getSaldo()+" Juros: "+this.getJuros();
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
	
}
