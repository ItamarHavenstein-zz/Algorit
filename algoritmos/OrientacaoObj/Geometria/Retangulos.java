package Geometria;

public class Retangulos extends Quadrilateros implements FormaGeometrica{

	public Retangulos(Double base, Double altura) {
		super(base, altura);
		
	}

	@Override
	public Double CalculoPerimetro() {
		Double soma = 2*(this.getAltura()+this.getBase());
		return soma;
	}

	@Override
	public Double CalculoArea() {
		Double soma = this.getBase() * this.getAltura();
		return soma;
	}

	
}
