package exercicios.CondeInter;
/*20. Peça para o usuário digitar seu nome e sobrenome. Altere todas as letras para maíusculas, 
 * imprima o resultado, e depois altere para minúsculas e altere o resultado. (texto = texto.toUpperCase();, 
 * texto = texto.toLowerCase();)*/
import java.util.Scanner;
public class Item18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome e sobrebome");
		String nome = scanner.nextLine();
		String nomeUp;
		String nomeLo;
		nomeUp =  nome.toUpperCase();
		System.out.println(nomeUp);
		nomeLo = nomeUp.toLowerCase();
		System.out.println(nomeLo);
		scanner.close();

	
	}
}
