package exerciciosScanner;/*1.	Escreva no console para digitar um n�mero inteiro,
 leia o n�mero inteiro digitado e imprima o n�mero no console.*/

import java.util.Scanner;

public class item1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int NumDig;
		System.out.println("Digite um numero inteiro");
		NumDig = scanner.nextInt();
		
		System.out.println("Numero digitado: " +NumDig);
		
		scanner.close();
		
		
	}
}
