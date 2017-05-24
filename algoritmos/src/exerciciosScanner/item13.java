package exerciciosScanner;
/*13. Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
 * 
 * a. Imprima true se o valor do primeiro número é menor ou igual a soma do segundo número 
 * com o terceiro e o quarto número, for impar ou maior que 10, caso contrário false.
 * 
b. Imprima true se a soma do primeiro dígito mais o segundo mais o terceiro mais o 
quarto dígito for múltiplo de 10, ou múltiplo de 5, ou o primeiro dígito for 5, ou a 
soma do primeiro dígito mais o segundo e o terceiro dígito, for maior que 100.0, e o primeiro dígito maior que 0.

c. Imprima true se o resultado da questão a e o resultado da questão b forem verdadeiras, 
ou o resultado da questão a e o resultado da questão b forem falsas.

d. Imprima false se o valor do primeiro dígito mais o segundo, terceiro e quarto for maior que 10, 
caso contrário true.

e. Imprima false se o primeiro número é maior que 10 ou o terceiro número for maior que 0, ou o 
segundo número mais o quarto número for igual a 0. Caso contrário true.*/

import java.util.Scanner;

public class item13 {

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
		
		int Num_4;
		System.out.println("Digite outro numero");
		Num_4 = scanner.nextInt();
		
		int soma = Num_1+Num_2+Num_3+Num_4;
		int soma_1 = Num_1+Num_2+Num_3;
		
		if(Num_1 <= (Num_2 + Num_3) && Num_4 %3 == 0 || Num_4 >10){
			System.out.println("1-True");
		}else {
			System.out.println("1-False");
			}if ((soma %10==0 || soma %5==0 ||Num_1 == 5 || soma_1 > 100 ) && Num_1 > 0 ){
				System.out.println("2-True");
			}else{
				System.out.println("2-False");
			}if((Num_1 <= (Num_2 + Num_3) && Num_4 %3 == 0 || Num_4 >10)&&((soma %10==0 || soma %5==0 ||Num_1 == 5 || soma_1 > 100 ) && Num_1 > 0)){
				System.out.println("3-True");
			}else {
				System.out.println("3-False");
			}
		scanner.close();
	}}
