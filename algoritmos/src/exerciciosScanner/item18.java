package exerciciosScanner;
/*18. Peça para o usuário digitar um número. Guarde o número que o usuário digitou. 
 * Subtraia o número por 5 e imprima o resultado. Pegue novamente o número que o usuário digitou e 
 * subtraia por 3 e imprima o resultado. Pegue o resultado da subtração por 5 e o resultado da subtração 
 * por 3 e imprima os dois resultado.*/

import java.util.Scanner;

public class item18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		int Subt = Num_1 - 5;
			System.out.println("resultado(num-5): "+Subt);
		int Subt_1 = Num_1 -3;
			System.out.println("resultado(num-3): "+Subt_1);
		System.out.println("Resultado: "+Subt+" E "+Subt_1);
		
		scanner.close();
	}
}
