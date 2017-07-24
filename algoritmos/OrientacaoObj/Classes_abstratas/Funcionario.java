package Classes_abstratas;

public abstract class Funcionario {

	private String nome;
	private int codigo;
	
	public abstract void informacoes();
	public abstract void bonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
