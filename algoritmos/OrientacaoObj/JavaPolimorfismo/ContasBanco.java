package JavaPolimorfismo;

public class ContasBanco {

	private Cliente cliente;
	private Agencia agencia;
	private String numConta;
	private Extratos extrato;
	
	public Extratos getExtrato() {
		return extrato;
	}
	public void setExtrato(Extratos extrato) {
		this.extrato = extrato;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String info (){
		String Extrato = "";
		Extrato += "Nome do Cliente: "+this.cliente.getNome();
		Extrato += "\nNome da Cidade: "+this.cliente.getCidade();
		Extrato += "\nNumero da conta: "+this.agencia.getAgencia();
		return Extrato;
	}
}
