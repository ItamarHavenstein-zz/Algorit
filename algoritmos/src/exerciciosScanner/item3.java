package exerciciosScanner;
/*3.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
 *  Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
 *   Imprima no console true se os dois número são iguais ou false se são diferentes.*/

import java.util.Scanner;

public class item3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int NumDig1;
		System.out.println("Digite um numero:");
		NumDig1 = scanner.nextInt();
		
		int NumDig2;
		System.out.println("digite um numero:");
		NumDig2 = scanner.nextInt();
		
		if(NumDig1 == NumDig2 & true){
			System.out.println("São iguais");
		} else{
			System.out.println("São diferentes");
		}
		scanner.close();

		}
	}
