package JavaPolimorfismo;

public class Extratos {

	private Cliente cliente;
	private Agencia agencia;
	private ContaCorrente contaCo;
	private ContaPoupanca contaPo;
	private ContasBanco conta;
	
	public String Extrato (){
		String Extrato = "";
		Extrato += "Nome do Cliente: "+this.getCliente().getNome();
		Extrato += "\nNome da Cidade: "+this.getCliente().getCidade();
		Extrato += "\nNumero da conta: "+this.getConta().getNumConta();
		return Extrato;
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

	public ContaCorrente getContaCo() {
		return contaCo;
	}

	public void setContaCo(ContaCorrente contaCo) {
		this.contaCo = contaCo;
	}

	public ContaPoupanca getContaPo() {
		return contaPo;
	}

	public void setContaPo(ContaPoupanca contaPo) {
		this.contaPo = contaPo;
	}

	public ContasBanco getConta() {
		return conta;
	}

	public void setConta(ContasBanco conta) {
		this.conta = conta;
	}
}
