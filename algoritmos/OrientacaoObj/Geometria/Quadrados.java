package Geometria;

public class Quadrados extends Quadrilateros  {

	public Quadrados(Double altura) {
		super(altura, altura);

		
	}

	@Override
	public String CalculoPerimetro() {
			String soma = "";
			 soma = "O perimetro do Quadrado "+(4 * super.getAltura())+"cm";
			return soma;
		}

	@Override
	public String CalculoArea() {
		String soma = "";
		 soma = "A area do Quadrado "+  super.getAltura()*super.getAltura()+"cm";
		return soma;
	}

	@Override
	public String GeraResposta() {
		String resposta = "";
		resposta += "\nO lado do Quadrado "+super.getAltura()+"cm";
		resposta += "\n"+CalculoArea();
		resposta += "\n"+CalculoPerimetro();
		return resposta;
	}
	}


