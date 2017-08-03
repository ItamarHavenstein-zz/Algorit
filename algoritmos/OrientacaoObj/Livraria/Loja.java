package Livraria;

public class Loja {

	private String nome;
	private double preco;

	public Loja(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Loja [nome=" + nome + ", preco=" + preco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
