package exerciciosScanner;
/*4.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
 *  Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
 *   Imprima no console true se o primeiro número é maior que o segundo número digitado.*/

import java.util.Scanner;

public class item4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int NumDig1;
		System.out.println("Digite um numero");
		NumDig1 = scanner.nextInt();
		
		int NumDig2;
		System.out.println("Digite um numero");
		NumDig2 = scanner.nextInt();
		
		if(NumDig1 > NumDig2 & true){
       		System.out.println("primeiro numero é maior que o segundo");
		}else{
			System.out.println("o segundo numero é maior que o primeiro");
			
			scanner.close();
		}
	}
}
