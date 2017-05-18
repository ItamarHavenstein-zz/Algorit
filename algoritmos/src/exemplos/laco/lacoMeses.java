package exemplos.laco;

public class lacoMeses {

		public static void main(String[] args) {
			int _valorMensal = 10;
			int _qtdMeses = 12;
			int aux = 0;
			double soma = 0;
			while(aux < _qtdMeses){
				soma += _valorMensal;
				aux++;
			}
			System.out.println("O valor da soma é " + soma);
			
		}
}
