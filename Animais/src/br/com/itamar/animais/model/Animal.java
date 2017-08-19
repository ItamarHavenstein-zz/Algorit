package br.com.itamar.animais.model;

public abstract class Animal {

	private Integer codigo;
	protected String nome;
	private String cor;
	private Integer qtdPatas;
	private String som;

	public Animal(Integer codigo, String nome, String cor, Integer qtdPatas, String som) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
		this.som = som;
	}

	public Animal(String nome, String cor, Integer qtdPatas, String som) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
		this.som = som;
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public void setQtdPatas(Integer qtdPatas) {
		this.qtdPatas = qtdPatas;
	}

}
