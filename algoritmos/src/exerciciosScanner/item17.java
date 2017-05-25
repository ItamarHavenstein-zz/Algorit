package exerciciosScanner;
/*Peça para o usuário digitar um número. Guarde o número que o usuário digitou. 
 * Some o número que o usuário digitou com 5. Imprima o resultado da soma. 
 * Pegue o resultado e some com 5 novamente. Imprima o resultado da soma.*/

import java.util.Scanner;

public class item17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int soma = Num_1 + 5;
			System.out.println("resultado (numero +5): "+soma);
		int soma_1 = soma + 5;
			System.out.println("resultado (soma +5): "+soma_1);
		
		scanner.close();
			
	}
}
