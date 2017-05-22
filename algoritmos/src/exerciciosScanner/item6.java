package exerciciosScanner;
/*6. Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
 *  Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 *  Imprima no console o resultado da divisão dos dois números.*/

import java.util.Scanner;

public class item6 {//se o segundo numero for maior não funciona

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero ");
		Num_1 = scanner.nextInt();
		
	    int Num_2;
		System.out.println("Digite outro numero");
		Num_2 = scanner.nextInt();
		 
		double a = Num_1;//conversao do numero int para double
		double b = Num_2;
		
		double Div = a / b;
		System.out.println("Resultado da divisão "+ Div);
		
		scanner.close();
	}
}
