package exercicios.CondeInter;
/*23. Peça para o usuário digitar o nome completo. Procure o primeiro espaço “ ” 
 * (int posicao = texto.indexOf(" ");). Guarde o valor. Procure agora pelo o último espaço “ ” no qual fizemos
 *  no exercício anterior. Agora, utilizando a função substring (texto = texto.substring(0, 10);), 
 *  insira os dois valores guardados anteriormente, e imprima o texto resultante.*/
import java.util.Scanner;

public class Item21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite se nome completo");
		String nome = scanner.nextLine();
		int posicao_1 = nome.indexOf(" ");
		int posicao_2 = nome.lastIndexOf(" ");
		String nomeF = nome.substring(posicao_1, posicao_2);
		System.out.println("nome digitado foi: "+nomeF);
		scanner.close();
	}
}
