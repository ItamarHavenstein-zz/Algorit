package exerciciosScanner;
/*12. Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * 
a. Imprima o resultado do seguinte cálculo (primeiro número multiplicado pelo terceiro número mais, o resultado somando com o segundo número elevado ao cubo). 
b. Imprima true se o resultado é maior que zero, caso contrário false. 
c. Imprima true se o resultado é maior que 10 ou maior que 1, caso contrário false. 
d. Imprima true se o resultado é menor que 10 ou maior que 100, caso contrário false. 
e. Imprima true se o resultado é múltiplo de 10, caso contrário false. 
f. Imprima true se o resultado é múltiplo de 2 e múltiplo de 3, caso contrário false.*/

import java.util.Scanner;

public class item12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Num_2;
		System.out.println("Digite outro numero");
		Num_2 = scanner.nextInt();
		
		int Num_3;
		System.out.println("Digite outro numero");
		Num_3 = scanner.nextInt();
		
		int soma = ((Num_1 * Num_3)+(Num_2 * Num_2 * Num_2));
			System.out.println("resultado de ((1�*3�)+(2�*2�*2)) "+soma);
		if (soma> 0){
			System.out.println("Maior que zero: True");
		} else {
			System.out.println("Maior que zero: False");
		}if(soma >1){
			System.out.println("Maior que 1: True");
		} else{
			System.out.println("Menor que 1: False");
		}if(soma<10|| soma>100){
			System.out.println("Menor que 10 ou maoir que 100: True");
		}else{
			System.out.println("Nao � menor que 10 ou maior que 100: False");
		}if(soma %10 == 0){
			System.out.println("multiplo de 10: True");
		}else{
			System.out.println("Multiplo de 10: False");
		}if(soma %2 == 0 && soma %3 == 0){
			System.out.println("multiplo de 2 e 3: True");
		}else {
			System.out.println("multiplo de 2 e 3: False");
		}
		
	
			scanner.close();
		}	
	}

