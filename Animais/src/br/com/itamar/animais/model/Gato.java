package br.com.itamar.animais.model;

public class Gato extends Animais{

	public Gato(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas, "Miau");
		
	}
	@Override
	public String Informações() {
		System.out.println("Gato");
		return super.Informações();
	}

}
