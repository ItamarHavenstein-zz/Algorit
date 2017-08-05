package Livraria;

import java.text.DecimalFormat;
import java.util.List;

public abstract class Loja implements Comparable<Loja> {
	DecimalFormat df = new DecimalFormat("#,##0.00R$");

	private String nome;
	/*
	 * colocando a variavel preco como Double que é usada para obj conseguimos
	 * utilizar em mais metodos do que, se fosse o metodo primitivo double que
	 * seria usada mais para calculo ou se vc não quiser usalo em alguma funçao
	 * mais "especifica"
	 */
	private Double preco;
	private String codBarras;

	public Loja(String nome, double preco, String codbarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codbarras;
	}

	@Override
	public String toString() {
		return "Codigo de Barras: " + this.codBarras + ", Nome: " + this.nome + ", Preço: " + df.format(this.preco);
	}

	/*
	 * neste metodo, comparo o codigo de barras que tenho dentro do meu
	 * arraylist com o obj que adiciono para comparação, primeiro preciso dizer
	 * para o programa que obj é um objeto do tipo Loja senão da erro na
	 * atribuição.
	 */
	@Override
	public boolean equals(Object obj) {
		Loja prod = (Loja) obj;
		return this.codBarras.equals(prod.getCodBarras());
	}

	@Override
	public int compareTo(Loja o) {
		return this.preco.compareTo(o.getPreco());
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

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

}
