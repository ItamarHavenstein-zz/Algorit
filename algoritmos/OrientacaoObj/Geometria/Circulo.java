package Geometria;

public class Circulo extends Quadrilateros implements FormaGeometrica{

	private Double raio;
	

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Circulo(Double raio) {
		super(raio, raio);
	}

	@Override
	public Double CalculoPerimetro() {
		Double soma = 2 * 3.14 * this.getRaio();
		return soma;
	}

	@Override
	public Double CalculoArea() {
		Double soma = 3.14 * (this.getRaio() * this.getRaio());
		return soma;
	}

}
