package Livraria;

public class Livros extends Loja {

	private String autor;

	public Livros(String nome, double preco, String autor, String codbarras) {
		super(nome, preco, codbarras);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro " + super.toString() + ", Autor: " + autor;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	

	

}
