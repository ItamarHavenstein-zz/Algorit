package exerciciosScanner;
/*20. Peça para o usuário digitar um texto. Guarde o texto que o usuário digitou em uma variável. 
 * Crie outra variável de nome “outroTexto”, atribuindo o valor da variável que o usuário digitou. 
 * Altere o valor da variável que o usuário digitou para “Olá”. Imprima as duas variáveis, e observe 
 * o que foi impresso.*/

import java.util.Scanner;

public class item20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String Text;
		System.out.println("Digite um texto");
		Text = scanner.nextLine();
	
		String OutroText = Text;
		Text ="olá";
		System.out.println(Text+" "+OutroText);
		
		scanner.close(); 
	}
}
