package br.com.itamar.animais.model;

public class Cachorro extends Animais{

	public Cachorro(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas, "Au-Au");
		
	}
	@Override
	public String Informa��es() {
	System.out.println("Cachorro");
		return super.Informa��es();
	}

	

}
