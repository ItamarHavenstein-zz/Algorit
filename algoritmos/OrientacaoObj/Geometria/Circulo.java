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
	     soma ="O perimetro do circulo "+ (2 * 3.14d * super.getAltura())+"cm";
		return soma;
	}

	@Override
	public String CalculoArea() {
		String soma = "";
		 soma = "A area do circulo "+ (3.14d * (super.getAltura() * super.getAltura()))+"cm";
		return soma;
	}

	@Override
	public String GeraResposta() {
		String resposta = "";
		resposta += "\nO raio do circulo "+super.getAltura()+"cm";
		resposta += "\n"+CalculoArea();
		resposta += "\n"+CalculoPerimetro();
		return resposta;
	}

}
