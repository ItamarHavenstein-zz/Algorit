package Classes_abstratas;

public abstract class Contas {

	private String numeroConta;
	private String nome;
	
	
	public Contas(String numeroConta, String nome) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public abstract void imprimiExtratoDetalhado();
	
}
