package Livraria;

import java.text.DecimalFormat;

public class Dvds extends Loja {
	DecimalFormat df = new DecimalFormat("000Min");

	private long duracao;

	@Override
	public String toString() {
		return "DVD " + super.toString() + ", Duracao: " + (duracao / 60) + " Min";

	}

	public Dvds(String nome, double preco, long duracao, String codbarras) {
		super(nome, preco, codbarras);
		this.duracao = duracao;
	}

	public long getDuracao() {
		return duracao;
	}

	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}

}
