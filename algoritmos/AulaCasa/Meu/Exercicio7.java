package Meu;

import java.util.Scanner;

/*(opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra: 
se x é par, x = x / 2 
se x é impar, x = 3 * x + 1 
imprime x 
O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será:40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1*/
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = scanner.nextInt();
		int x = 0;
		
		if(num%2==0){
			x = (num / 2);
		}else{if (num%3==0){
			x = ((3*num)+1);
		}
		}
		
		System.out.println("o valor do x é: "+x);
		
		switch (x){
		case 1:
			System.out.println("X igual a 1");
			break;
		}
		
		scanner.close();
	}
}
