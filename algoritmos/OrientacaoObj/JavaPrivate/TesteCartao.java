package JavaPrivate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartao {
	
	public static void main(String[] args) throws ParseException {//precisa colocar esse (throws parseexception) para funcionar no comando
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
				//em cada lugar onde uso a criação de um novo cartão preciso colocar os parametros corretamente
				CartaoDeCredito cartao1 = new CartaoDeCredito (10);
				//ficou obsoleto com a criação do construtor (cartao1.numeroCartao = "10";)
			    cartao1.validadeCartao = sdf.parse("01/01/2020");
			    
			    System.out.println("Cartao 1: de numero "+ cartao1.numeroCartao + " com validade até " +
			    					sdf.format(cartao1.validadeCartao));
			    
			    CartaoDeCredito cartao2 = new CartaoDeCredito (20);
			    cartao2.validadeCartao = sdf.parse("01/01/2025");
			    
			    System.out.println("Cartao 2: de numero "+ cartao2.numeroCartao + " com validade até " +
			    					sdf.format(cartao2.validadeCartao));
			    
			    //criando vinculo entre cartao e cliente
			    ClientesBanco cli = new ClientesBanco();
				cartao1.cliente = cli;
				
				cartao1.cliente.nomeClientes = "Paulo";
				System.out.println("O cliente "+cartao1.cliente.nomeClientes+" com o cartão de numero "+ cartao1.numeroCartao+
						" e com validade ate "+sdf.format(cartao1.validadeCartao));
			    
			    
}
}
