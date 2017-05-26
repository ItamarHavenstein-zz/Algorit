package exercicios.CondeInter;
/*10. Peça para o usuário digitar dois números double. E efetue as seguintes validações:
a. Se a soma dos números for maior que 20, imprima no console “<resultado da soma> é maior que 20”
b. Se a soma dos números for maior que 30, imprima no console “<resultado da soma> é maior que 30”
c. Se a soma dos números for maior que 10 ou maior que 20, imprima no console “<resultado da soma>
 é maior que 10 ou <resultado da soma> maior que 20 ”
d. Se a soma dos número é múltiplo de 5 e múltiplo de 10, imprima no console “<resultado da soma>
 é múltiplo de 5 e <resultado da soma> de 10”
e. Se a soma dos número é múltiplo de 5 e múltiplo de 10, ou o primeiro número digitado é 5, 
imprima no console “<resultado da soma> é múltiplo de 5 e <resultado da soma> de 10 ou o 
<primeiro número digitado> é 5”*/

import java.util.Scanner;

public class Item8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		double num_1;
		System.out.println("Digite um numero com virgula(0,00)");
		num_1 = scanner.nextDouble();
		
		double num_2;
		System.out.println("Digite outro numero com virgula(0,00)");
		num_2 = scanner.nextDouble();
		 
		double soma = num_1 + num_2;
			
		if(soma>20){
			System.out.println("O resultado maior que 20");
		}
		if(soma>20 && soma>30){
			System.out.println("O resultado maior que 30");
		}
		if(soma>10 || soma>20){
			System.out.println("O resultado maior que 10 ou maior que 20");
		}
		if (soma%5==0 && soma%10==0){
			System.out.println("O resultado é multiplo de 5 e multiplo de 10" );
		}
		if(soma%5==0 && soma%10==0 || num_1 ==5){
			System.out.println("O resultado é multiplo de 5 e multiplo de 10 ou o priemiro numero é 5");
		}
			
		
	
		
		scanner.close();
	}
}
