package Livraria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LojaTeste {
	/*
	 * este metodo estatico faz a busca dos objetos que introduzimos no nosso
	 * arraylist "buscaProduto(dvd1, produto);" este é o comando para buscar o
	 * produto, no metodo colocamos "Loja" a classe, "produtos" variavel criada,
	 * "List<Loja>" lista que criamos na loja, "produto" nome da nossa lista
	 * criada, fazemos um foreach onde temos "loja" é a classe, "produ" nome da
	 * variavel que criamos, "produto" lista que criamos, no "if" fazemos a
	 * comparação "produ" com a lista "produto" para ver se encontra.
	 */
	public static void buscaProduto(Loja produtos, List<Loja> produto) {
		int aux = 0;
		for (Loja produ : produto) {

			if (produ.equals(produtos)) {
				System.out.println("\nResultado da Busca do produto: \n" + produ);
				aux++;
			}
		}
		if (aux != 1) {
			System.out.println("\nProduto não encontrado na loja");
		}
	}

	public static void main(String[] args) {
		// CRIANDO LIVROS

		// inserindo as variaveis dos livros
		Livros livro1 = new Livros("Nem Que a Vaca Tussa", 15.99, "Não Sei", "0000000010");
		Livros livro2 = new Livros("O viver", 24.15, "Não sei", "0000000011");
		Livros livro3 = new Livros("O mundo", 36.56, "Não Sei", "0000000012");
		Livros livro4 = new Livros("O seu Mundo", 50.00, "nao Sei", "0000000013");
		// inserindo as variaveis dos cds
		Cds cd = new Cds("Novo Album", 25.45, "10", "0000000014");
		Cds cd1 = new Cds("Album 1", 35.45, "15", "0000000015");
		Cds cd2 = new Cds("Album 2", 15.45, "8", "0000000016");
		// inserindo as variaveis dos dvds
		Dvds dvd3 = new Dvds("Um dia depois de amanha", 100.21, 10000, "0000000017");
		Dvds dvd1 = new Dvds("O dia de hoje", 80.65, 8600, "0000000018");
		Dvds dvd2 = new Dvds("Amanha nunca dorme", 60.54, 5000, "0000000019");
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
		 * neste comando busco um produto dentro da lista de produtoas da minha
		 * loja para ver se encontro ou não
		 */
		buscaProduto(dvd1, produto);

		/*
		 * neste ponto chamo o metodo equals que eu sobscrevi na minha classe
		 * loja
		 */
		System.out.println("\nComparando 2 Produtos para ver se tem o mesmo Codigo: \n" + livro1.toString()
				+ " \n COMPARANDO COM \n" + livro3.toString() + "\n" + livro1.equals(livro3));

		/* usando o collections.sort voce organiza pelo nome */
		Collections.sort(produto);

		for (Loja loja : produto) {
			System.out.println(loja.toString());
		}

	}

}