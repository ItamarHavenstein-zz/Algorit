package Empresa;

public abstract class Empregado implements ImpleEmpregado {

	private String nome;
	private String sobrenome;

	public Empregado(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public abstract void CalculaGanho();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
