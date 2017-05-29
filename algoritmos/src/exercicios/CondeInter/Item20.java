package exercicios.CondeInter;
/*22. Peça para o usuário digitar o nome completo. Busque em qual posição está o último espaço “ ” 
 * (texto.lastIndexOf(“ ”);). Guarde este valor, e agora some mais 1 neste valor utilizando ++. 
 * Agora utilizando o substring, coloque o valor do resultado da soma e imprima o texto 
 * (texto = texto.substring(0);). Veja o que acontece.*/
import java.util.Scanner;
public class Item20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome completo");
		String nome = scanner.nextLine();
		int num = nome.lastIndexOf(" ");
		num ++;
		System.out.println(nome+" "+num);
		nome = nome.substring(num);
		System.out.println(nome);
		scanner.close();
	}
}
