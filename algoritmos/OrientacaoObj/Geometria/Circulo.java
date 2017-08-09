package Geometria;

public class Circulo extends Quadrilateros {

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
	public String CalculoPerimetro() {
		String soma = "";
	     soma ="a soma "+ 2 * 3.14 * this.getRaio();
		return soma;
	}

	@Override
	public String CalculoArea() {
		String soma = "";
		 soma ="a soma"+ 3.14 * (this.getRaio() * this.getRaio());
		return soma;
	}

}
