package Exercicio.ArrayMatriz;
import java.util.Scanner;

/*20. Crie um array int com 3 posições e peça para o usuário digitar um valor, e insira o valor na 
 * primeira posição do array, peça para o usuário digitar outro valor e insira o valor na segunda posição 
 * do array, peça para o usuário digitar outro valor e insira o valor terceira prosição do array.*/
public class Item20 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int [] digit = new int[3];
	
	System.out.println("Digite Um numero");
	digit[0] = scanner.nextInt();
	System.out.println("Digite outro numero");
	digit[1] = scanner.nextInt();
	System.out.println("Digite outro numero");
	digit[2] = scanner.nextInt();
	
	System.out.println();
	
	for(int a = 0; a<digit.length;a++)
	System.out.println(digit.length+" "+digit[a]);
	scanner.close();
}
}
