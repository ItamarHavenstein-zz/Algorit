package Livraria;

public class Dvds extends Loja {

	private long duracao;

	@Override
	public String toString() {
		return "Dvds [duracao=" + duracao + "]";
	}

	public Dvds(String nome, double preco, long duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	public long getDuracao() {
		return duracao;
	}

	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}

}
