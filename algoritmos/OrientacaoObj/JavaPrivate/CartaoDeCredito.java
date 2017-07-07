package JavaPrivate;

import java.util.Date;

public class CartaoDeCredito {
	private int numeroCartao;
	private Date validadeCartao;
    ClientesBanco cliente;
	
	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Date getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(Date validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public ClientesBanco getCliente() {
		return cliente;
	}

	public void setCliente(ClientesBanco cliente) {
		this.cliente = cliente;
	}

	public CartaoDeCredito(int numero){
		this.numeroCartao = numero;
	}
}
