package exercicios.CondeInter;
/*24. Utilizando o exercício 21 como exemplo, tente extrair o mês da data, utilizando as 
 * funções indexOf e substring.*/
import java.util.Scanner;
public class Item22 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua data de aniversário(dd/mm/aaaa)");
		String data = scanner.nextLine();
		int posicao = data.indexOf("/");
		posicao++;
		int posicao_1 = data.lastIndexOf("/");
		String mes = data.substring(posicao, posicao_1);
		System.out.println("O mês do seu aniversário é: "+mes);
		scanner.close();
	}
}
