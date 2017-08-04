package Livraria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LojaTeste {
	public static void main(String[] args) {
		// CRIANDO LIVROS

		// inserindo as variaveis dos livros
		Livros livro1 = new Livros("Nem Que a Vaca Tussa", 15.99, "Não Sei", "0000000010");
		Livros livro2 = new Livros("O viver", 24.15, "Não sei", "0000000011");
		Livros livro3 = new Livros("O mundo", 36.56, "Não Sei", "0000000012");
		Livros livro4 = new Livros("O seu Mundo", 50.00, "nao Sei", "0000000013");
		// inserindo as variaveis dos cds
		Cds cd = new Cds("novo Album", 25.45, "10", "0000000014");
		Cds cd1 = new Cds("Album 1", 35.45, "15", "0000000015");
		Cds cd2 = new Cds("Album 2", 15.45, "8", "0000000016");
		// inserindo as variaveis dos dvds
		Dvds dvd3 = new Dvds("um dia depois de amanha", 100.21, 10000, "0000000017");
		Dvds dvd1 = new Dvds("O dia de hoje", 80.65, 8600, "0000000018");
		Dvds dvd2 = new Dvds("amanha nunca dorme", 60.54, 5000, "0000000019");
		// inserindo os produtos criados dentro da lista loja
		List<Loja> produto = new ArrayList();
		produto.add(dvd2);
		produto.add(dvd1);
		produto.add(dvd3);
		produto.add(cd2);
		produto.add(cd1);
		produto.add(cd);
		produto.add(livro1);
		produto.add(livro2);
		produto.add(livro3);
		produto.add(livro4);

		/*
		 * fazendo um foreach para percorrer minha lista de livros for=é o
		 * comando, Livros= é o nome da Classe, livro=é o nome da variavel que
		 * eu crieipara o for, livros= é a minha lista que eu criei
		 */
		for (Loja loja : produto) {
			System.out.println(loja.toString());
		}
		/*
		 * neste ponto chamo o metodo equals que eu sobscrevi na minha classe
		 * loja
		 */
		System.out.println(livro1.equals(livro2));
		System.out.println(livro1.equals(livro1));

		buscaProduto(dvd3, produto);

	}

	public static void buscaProduto(Loja prod, List<Loja> produto) {
		for (Loja produ : produto) {
			if (produ.equals(produto)) {
				System.out.println(produto);
			} else {
				System.out.println("produto não encontrado");
			}
		}
	}
}