package exemplos.laco;

public class lacoMesesFor {

		public static void main(String[] args) {
			int _valorMensal = 10;
			int _qtdMeses = 12;
			double soma = 0;
			for(int aux = 0; aux < _qtdMeses; aux++){
				soma += _valorMensal;
			}
			System.out.println("O valor da soma é " + soma);

		}
}
