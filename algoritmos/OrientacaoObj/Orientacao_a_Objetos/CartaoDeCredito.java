package Orientacao_a_Objetos;

import java.util.Date;

public class CartaoDeCredito {
	int numeroCartao;
	Date validadeCartao;
	ClientesBanco cliente;
	
	public CartaoDeCredito(int numero){
		this.numeroCartao = numero;
	}
}
