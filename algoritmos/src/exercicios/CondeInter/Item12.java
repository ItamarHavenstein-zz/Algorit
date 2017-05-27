package exercicios.CondeInter;
/*14. Um comerciante comprou um produto e quer vende-lo com um lucro de 50% 
 * se o valor da compra for menor que R$ 20,00. Caso contrário, o lucro será 35%. 
 * Entrar com o valor do produto e imprimir o valor de venda.*/

import java.util.Scanner;

public class Item12 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		double valor;
	    System.out.println("Insira o valor do produto");
		valor = scanner.nextDouble();
		
		if(valor<20){
			System.out.println("valor da venda do produto: "+(valor+(valor*50)/100)+"R$.");
		}else{
			System.out.println("Valor da venda do produto: "+(valor+(valor*35)/100)+"R$.");
		}
		scanner.close();
	}
}
