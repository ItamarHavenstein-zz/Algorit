package CollectionsJava;

public class Cliente {
	private String nome;
	private String cpf;
	private String numConta;
	
	
	public Cliente(String nome, String cpf, String numConta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numConta = numConta;
	}
	public String gerarExtrato(){
		String extrato = "";
		extrato = "Nome: "+this.getNome();
		extrato = " CPF: "+this.getCpf();
		extrato = " Numero da Conta: "+this.getNumConta();
		return extrato;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
