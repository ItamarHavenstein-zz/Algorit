package exerciciosScanner;
/*5. Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console true se o resultado do primeiro número menos o segundo número é maior 
 * que 0 e false caso for menor igual a 0.*/

import java.util.Scanner;

public class item5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Num_2;
		System.out.println("Digite um numero");
		Num_2 = scanner.nextInt();
		
		int Subt = Num_1 - Num_2;
		if(Subt > 0){
			System.out.println("True");
			}else {
				System.out.println("False");
			}
		scanner.close();
	}
}
