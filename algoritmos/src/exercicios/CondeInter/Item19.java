package exercicios.CondeInter;
/*21. Peça para o usuário digitar sua data de nascimento em texto “01/02/1990”. 
 * Busque a posição do última barra “/”contida na data. Imprime a posição da barra. 
 * (int posicao = texto.lastIndexOf("A");)*/
//texto.lastIndexOf("A");mostra a ultima posição do A no texto 
//texto.indexOf("A");mostra quantos A tem no texto

import java.util.Scanner;
public class Item19 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua data de  nascimento(dd/mm/aaaa)");
		String data = scanner.nextLine();
		int posicao = data.lastIndexOf("/");
		System.out.println(posicao);
		scanner.close();
	}

}
