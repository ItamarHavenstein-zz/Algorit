package exerciciosScanner;
/*8. Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
 *  Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 *  Imprima no console true se o primeiro número digitado é maior que 5 e o segundo número menor que 10. 
 *  Caso contrário imprima false.*/

import java.util.Scanner;

public class item8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Num_2;
		System.out.println("Digite um numero");
		Num_2 = scanner.nextInt();
		
		if(Num_1 > 5 && Num_2 <10){
			System.out.println("True");
			}else{
				System.out.println("False");
			}
		scanner.close();
	}
}
