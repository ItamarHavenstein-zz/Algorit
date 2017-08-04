package Livraria;

public class Cds extends Loja {

	private String numFaixas;

	@Override
	public String toString() {
		return "CD " + super.toString() + ", Numero de Faixas: " + numFaixas;

	}

	public Cds(String nome, double preco, String numFaixas, String codbarras) {
		super(nome, preco, codbarras);
		this.numFaixas = numFaixas;
	}

	public String getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(String numFaixas) {
		this.numFaixas = numFaixas;
	}

}
