package br.com.itamar.animais.model;

public class PorquinhodaIndia extends Animais {

	public PorquinhodaIndia(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas, "Nhôi");

	}

	@Override
	public String Informações() {
		System.out.println("Porquinho da India");
		return super.Informações();
	}
}
