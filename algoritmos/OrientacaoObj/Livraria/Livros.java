package Livraria;

public class Livros extends Loja {

	private String autor;

	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livros [autor=" + autor + "]";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
