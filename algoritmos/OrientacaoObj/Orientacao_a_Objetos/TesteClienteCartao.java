package Orientacao_a_Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartao {
	
	public static void main(String[] args) throws ParseException  {
		SimpleDateFormat sdf = new SimpleDateFormat ();
		CartaoDeCredito cre = new CartaoDeCredito();
		ClientesBanco cli = new ClientesBanco();
		cre.cliente = cli;
		
		cre.cliente.codigoClientes = 1;
		cre.cliente.nomeClientes = "Paulo";
		
		cre.numeroCartao = "12235654";
		cre.validadeCartao = sdf.parse("01/01/2019");
		
		System.out.println("O Cliente "+cre.cliente.nomeClientes+ " com codigo "
				+cre.cliente.codigoClientes + " e numero do cartao "+cre.numeroCartao+
				" com validade ate "+sdf.format(cre.validadeCartao));
		
	}
}
