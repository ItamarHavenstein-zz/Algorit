package exerciciosScanner;
/*19. Peça para o usuário digitar um número. Guarde o número que o usuário digitou na variável “primeiroNumero”.
 * Crie outra variável de nome “segundoNumero”, atribuindo o valor da variável “primeiroNumero”. 
 * Altere o valor da variavel “primeiroNumero” para 10. Imprima a variável “primeiroNumero” e a 
 * variável “segundoNumero”. Verifique os valores das variáveis, como ficaram.*/

import java.util.Scanner;

public class item19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Num_2 = Num_1;
		System.out.println(Num_1+" " +Num_2);
		
		scanner.close();
				
	}
}
