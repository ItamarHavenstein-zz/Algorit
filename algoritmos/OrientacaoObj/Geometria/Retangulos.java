package Geometria;

public class Retangulos extends Quadrilateros {

	public Retangulos(Double base, Double altura) {
		super(base, altura);
		
	}

	@Override
	public String CalculoPerimetro() {
		String soma = "";
		 soma = "O perimetro do Retangulo "+ 2*(super.getAltura()+super.getBase())+"cm";
		return soma;
	}

	@Override
	public String CalculoArea() {
		String soma = "";
		soma = "A Area do retangulo "+super.getBase() * super.getAltura()+"cm";
		return soma;
	}

	@Override
	public String GeraResposta() {
		String resposta = "";
		resposta += "\nA altura do Retangulo "+super.getAltura()+"cm";
		resposta += "\nA base do Retangulo "+super.getBase()+"cm";
		resposta += "\n"+CalculoArea();
		resposta += "\n"+CalculoPerimetro();
		return resposta;
	}

	
}
