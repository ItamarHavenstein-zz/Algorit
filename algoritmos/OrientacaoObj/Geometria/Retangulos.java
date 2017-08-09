package Geometria;

public class Retangulos extends Quadrilateros {

	public Retangulos(Double base, Double altura) {
		super(base, altura);
		
	}

	@Override
	public String CalculoPerimetro() {
		String soma = "";
		 soma = "A soma "+ 2*(this.getAltura()+this.getBase());
		return soma;
	}

	@Override
	public String CalculoArea() {
		String soma = "";
		soma = "Asoma "+this.getBase() * this.getAltura();
		return soma;
	}

	
}
