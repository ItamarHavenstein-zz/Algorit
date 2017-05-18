package exemplos.condicao;

public class CondicaoQtdMeses {
	
	public static void main(String[] args) {
		int _qtdMeses = 12;
		double soma = 100;
		int aux = 4;
		if(_qtdMeses == aux && soma > 99){
			System.out.println("12 meses e Soma maior que 99");
		} else if((_qtdMeses == aux && soma > 99)
		|| (_qtdMeses == 10 && soma < 99)){
			System.out.println("11 meses");
		} else if(_qtdMeses == aux){
			System.out.println("5 meses");
		}

	}
}
