package exerciciosScanner;
/*10. Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console o valor do resultado do primeiro número elevado ao quadrado mais o 
 * segundo número elevado ao quadrado.*/

import java.util.Scanner;

public class item10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Num_2;
		System.out.println("Digite outro numero");
		Num_2 = scanner.nextInt();
		
		int Mult_1 = Num_1 * Num_1;
		int Mult_2 = Num_2 * Num_2;
		int Soma = Mult_1 + Mult_2;
		
		System.out.println("O resultado " + Soma);
		
		scanner.close();
	}
}
