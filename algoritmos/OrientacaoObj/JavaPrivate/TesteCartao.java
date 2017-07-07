package JavaPrivate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartao {
	
	public static void main(String[] args) throws ParseException {//precisa colocar esse (throws parseexception) para funcionar no comando
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
				//em cada lugar onde uso a criação de um novo cartão preciso colocar os parametros corretamente
				CartaoDeCredito cartao1 = new CartaoDeCredito (10);
				//ficou obsoleto com a criação do construtor (cartao1.numeroCartao = "10";)
			    cartao1.setValidadeCartao(sdf.parse("01/01/2020"));
			    
			    System.out.println("Cartao 1: de numero "+ cartao1.getNumeroCartao() + " com validade até " +
			    					sdf.format(cartao1.getValidadeCartao()));
			    
			    CartaoDeCredito cartao2 = new CartaoDeCredito (20);
			    cartao2.setValidadeCartao(sdf.parse("01/01/2025")); 
			    
			    System.out.println("Cartao 2: de numero "+ cartao2.getNumeroCartao()+ " com validade até " +
			    					sdf.format(cartao2.getValidadeCartao()));
			    
			    //criando vinculo entre cartao e cliente
			    ClientesBanco cli = new ClientesBanco();
				cartao1.setCliente(cli);
				
				cartao1.cliente.setNomeClientes("Paulo");
				System.out.println("O cliente "+cartao1.cliente.getNomeClientes()+" com o cartão de numero "+ cartao1.getNumeroCartao()+
						" e com validade ate "+sdf.format(cartao1.getValidadeCartao()));
			    
			    
}
}
