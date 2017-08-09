package Geometria;

public class Quadrados extends Quadrilateros  {

	public Quadrados(Double altura) {
		super(altura, altura);

		
	}

	@Override
	public String CalculoPerimetro() {
			String soma = "";
			 soma = "A soma "+(4 * super.getAltura());
			return soma;
		}

	@Override
	public String CalculoArea() {
		String soma = "";
		 soma = "a soma "+  super.getAltura()*super.getAltura();
		return soma;
	}
	}


