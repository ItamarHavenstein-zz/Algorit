package exerciciosScanner;
/*3.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado.
 *  Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
 *   Imprima no console true se os dois n�mero s�o iguais ou false se s�o diferentes.*/

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
			System.out.println("S�o iguais");
		} else{
			System.out.println("S�o diferentes");
		}
		scanner.close();

		}
	}
