package JavaPolimorfismo;

public class ContaPoupanca extends ContasBanco {
	
	private double saldoP;
	private double juros;
	
	
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
}
