package JavaPolimorfismo;

public class ContaCorrente extends ContasBanco{
	
	private double saldo;
	private double limite;
	private double encargos;
	
	
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
	
}
