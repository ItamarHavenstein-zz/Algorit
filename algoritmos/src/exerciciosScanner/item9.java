package exerciciosScanner;
/*9. Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console true se o primeiro número é menor igual a zero ou o segundo número é maior que 10.
 *  Caso contrário imprima false.*/

import java.util.Scanner;

public class item9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Num_2;
		System.out.println("Digite outro numero");
		Num_2 = scanner.nextInt();
		
		if(Num_1 <= 0 || Num_2 > 10){
			System.out.println("True");
			}else{
				System.out.println("False");
			}
		scanner.close();
	}
}
