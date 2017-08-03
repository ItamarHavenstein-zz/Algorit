package Livraria;

public class Cds extends Loja {

	private String numFaixas;

	@Override
	public String toString() {
		return "Cds [numFaixas=" + numFaixas + "]";
	}

	public Cds(String nome, double preco, String numFaixas) {
		super(nome, preco);
		this.numFaixas = numFaixas;
	}

	public String getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(String numFaixas) {
		this.numFaixas = numFaixas;
	}

}
