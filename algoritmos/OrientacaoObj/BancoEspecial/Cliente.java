package BancoEspecial;

public class Cliente {

	private String nome;
	private String rg;
	private String cidade;
	
	
	public Cliente(String nome, String rg, String cidade) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cidade = cidade;
	}
	public Cliente(){
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
