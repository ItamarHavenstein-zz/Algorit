package Geometria;

public  abstract class Quadrilateros  {

	private Double base;
	private Double altura;
	
	public Quadrilateros(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	

}