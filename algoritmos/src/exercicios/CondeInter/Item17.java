package exercicios.CondeInter;
/*19. Peça para o usuário digitar um texto e altere todas as vogais do texto, para a letra w, 
 * utilizando o replace. (texto = texto.replace("antigoCaracter", "novoCaracter");)*/

import java.util.Scanner;

public class Item17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = scanner.nextLine();
	
		
		String frase_1;
		String frase_2;
		String frase_3;
		String frase_4;
		String frase_5;
		
		frase_1 = frase.replaceAll("a", "w");
		frase_2 = frase_1.replaceAll("e", "w");
		frase_3 = frase_2.replaceAll("i", "w");
		frase_4 = frase_3.replaceAll("o", "w");
		frase_5 = frase_4.replaceAll("u", "w");
		
		System.out.println(frase_5);
		scanner.close();
	}
}
