package CompaniaAerea;

public abstract class Aviao {

	private final int lugares;
	private final double valorPassagen;
	
	public Aviao (int lugar, double valor){
		this.lugares = lugar;
		this.valorPassagen = valor;
	}
	public int getLugares() {
		return lugares;
	}
	
	public double getPassagens() {
		return valorPassagen;
	}
	
}
