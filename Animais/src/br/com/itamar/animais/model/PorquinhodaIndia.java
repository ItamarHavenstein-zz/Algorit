package br.com.itamar.animais.model;

public class PorquinhodaIndia extends Animais {

	public PorquinhodaIndia(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas, "Nh�i");

	}

	@Override
	public String Informa��es() {
		System.out.println("Porquinho da India");
		return super.Informa��es();
	}
}
