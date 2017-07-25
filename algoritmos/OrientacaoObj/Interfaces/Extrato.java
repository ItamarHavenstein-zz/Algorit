package Interfaces;

public class Extrato {

	private Agencia agencia;
	private Conta cliente;
	private ContaCorrente contac;
	private ContaPoupanca contap;
	
	public String gerarExtrato () {
		String Extrato = "";
		Extrato = "\nNome do Cliente: "+this.getCliente().getNome();
		Extrato = "\nNumero da Conta: "+this.getCliente().getNumeroConta();
		Extrato = "\nNumero da Agencia: "+this.getAgencia().getAgencia();
		return Extrato;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Conta getCliente() {
		return cliente;
	}
	public void setCliente(Conta cliente) {
		this.cliente = cliente;
	}
	public ContaCorrente getContac() {
		return contac;
	}
	public void setContac(ContaCorrente contac) {
		this.contac = contac;
	}
	public ContaPoupanca getContap() {
		return contap;
	}
	public void setContap(ContaPoupanca contap) {
		this.contap = contap;
	}
	
}
