package exerciciosScanner;
/*7. Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console true se o resultado da divisão dos dois número é par, e false caso o
 *  resultado da divisão seja ímpar.*/

import java.util.Scanner;

public class item7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Num_2;
		System.out.println("Digite outro numero");
		Num_2 = scanner.nextInt();
		
		int Div = Num_1 / Num_2;
		if(Div %2 == 0){
			System.out.println("True");
			}else{
				System.out.println("false");
			}
		scanner.close();
	}
}
