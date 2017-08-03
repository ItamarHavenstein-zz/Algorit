package Livraria;

import java.util.ArrayList;
import java.util.List;

public class LojaTeste {
	public static void main(String[] args) {
		List<Livros> livros = new ArrayList();
		
		Livros livro1 = new Livros("Nem Que a Vaca Tussa", 15.99, "Não Sei");
		
		livros.add(livro1);
		
		System.out.println(livros);
	}
}
