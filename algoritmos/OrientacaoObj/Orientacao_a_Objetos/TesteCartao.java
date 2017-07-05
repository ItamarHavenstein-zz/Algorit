package Orientacao_a_Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartao {
	
	public static void main(String[] args) throws ParseException {//precisa colocar esse (throws parseexception) para funcionar no comando
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
				
				CartaoDeCredito cartao1 = new CartaoDeCredito ();
				cartao1.numeroCartao = "10";
			    cartao1.validadeCartao = sdf.parse("01/01/2020");
			    
			    System.out.println("Cartao 1: "+ cartao1.numeroCartao + " com validade até " +
			    					sdf.format(cartao1.validadeCartao));
			    CartaoDeCredito cartao2 = new CartaoDeCredito ();
				cartao2.numeroCartao = "10";
			    cartao2.validadeCartao = sdf.parse("01/01/2025");
			    
			    System.out.println("Cartao 2: "+ cartao2.numeroCartao + " com validade até " +
			    					sdf.format(cartao2.validadeCartao));
			    //criando vinculo entre cartao e cliente
			    ClientesBanco cli = new ClientesBanco();
				cartao1.cliente = cli;
				
				cartao1.cliente.nomeClientes = "Paulo";
				System.out.println(cartao1.cliente.nomeClientes+" "+ cartao1.numeroCartao);
			    
			    
}
}
