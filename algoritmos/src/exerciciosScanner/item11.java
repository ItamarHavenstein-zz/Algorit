package exerciciosScanner;
/*11. Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console o resto do primeiro número digitado com o segundo número digitado, 
 * o multiplicando por 10.*/

import java.util.Scanner;

public class item11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Num_2;
		System.out.println("Digite outro numero");
		Num_2 = scanner.nextInt();
		
		int soma = Num_1 +Num_2;
		int Mult = soma * 10;
		System.out.println("O resultado multiplicado: " +Mult);
		
		scanner.close();
	}
}
