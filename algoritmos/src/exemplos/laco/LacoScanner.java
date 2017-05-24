package exemplos.laco;
/*      a seguir temos mais sobrea biblioteca do scanner para cada tipo de variavel.
        float numF = sc.nextFloat();
		int num1 = sc.nextInt();
		byte byte1 = sc.nextByte();
		long lg1 = sc.nextLong();
		boolean b1 = sc.nextBoolean();
		double num2 = sc.nextDouble();
		String nome = sc.nextLine();*/

import java.util.Scanner;//biblioteca da instrucao

public class LacoScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int _qtdMeses;
		System.out.println("Digite a quantidade de meses:");
		_qtdMeses = scanner.nextInt();
		
		int _valorMensal;
		System.out.println("Digite o valor Mensal:");
		_valorMensal = scanner.nextInt();
		
		int aux = 0;
		double soma = 0;
		while (aux < _qtdMeses) {
			soma += _valorMensal;
			aux++;
		}
		
		System.out.println("O valor da soma é " + soma);
		
		scanner.close();
	}

}
