package Geometria;

public class Quadrados extends Quadrilateros implements FormaGeometrica {

	public Quadrados(Double altura) {
		super(altura, altura);

	}

	@Override
	public Double CalculoPerimetro() {
		Double soma = 4 * this.getAltura();
		return soma;
	}

	@Override
	public Double CalculoArea() {
		Double soma = 2 * this.getAltura();
		return soma;
	}

}
