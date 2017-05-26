package exercicios.CondeInter;
/*7. Calculadora
a. Peça para o usuário digitar um número, e armazene o número
b. Peça para o usuário digitar um operador matemático (+, -, /, x), e armazene o o operador
c. Peça para o usuário digitar outro número, e armazene o número
d. Caso o usuário digitou o operador +,some os dois números e imprima o resultado “Valor da soma: <resultado>”.
e. Caso o usuário digitou o operador -,subtraia os dois números e imprima o resultado “Valor da subtração: <resultado>”.
f. Caso o usuário digitou o operador /,divida os dois números e imprima o resultado “Valor da divisão: <resultado>”.
g. Caso o usuário digitou o operador *,multiplique os dois números e imprima o resultado “Valor da multiplicação: <resultado>”.
*/

import java.util.Scanner;

public class Item7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num_1;
		System.out.println("Digite um numero inteiro");
		num_1 = scanner.nextInt();
		
		String sinal;
		System.out.println("Digite um operador matemático(+,-,/,*)");
		sinal = scanner.next();
		
		int num_2;
		System.out.println("Digite outro numero inteiro");
		num_2 = scanner.nextInt();
		
		double num_3 = num_1;
		double num_4 = num_2;
		double div = num_3/num_4;
		
		if(sinal.equals("+")){
			System.out.println("Resultado da soma: "+(num_1+num_2));
		}else{
			if(sinal.equals("-")){
				System.out.println("Resultado da subtração: "+(num_1-num_2));
			}else{
				if(sinal.equals("/")){
					System.out.println("Resultado da divisão: "+div);
				}else{
					if(sinal.equals("*")){
						System.out.println("Resultado da multiplicação: "+(num_1*num_2));
					}
				}
			}
		}
		scanner.close();
	}
}
