package br.com.itamar.animais.model;

public abstract class Animais {

	private String nome;
	private String cor;
	private int qtdPatas;
	private String som;
	
	
	public Animais(String nome, String cor, int qtdPatas, String som) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
		this.som = som;
	}
	public String Informações(){
		String info = "";
		info += "\nNome: "+this.getNome();
		info += "\nSom: "+this.getSom();
		return info;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}
	
}
