package JavaPrivate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartao {
	
	public static void main(String[] args) throws ParseException  {
		//criamos para a formatação de datas
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		
		//criamos o cartao e o novo cliente
		CartaoDeCredito cre = new CartaoDeCredito(12235654);
		ClientesBanco cli = new ClientesBanco();
		cre.cliente = cli;//vincular o cartao ao cliente
		
		//inserindo os valores 
		cre.cliente.setCodigoClientes(1); 
		cre.cliente.setNomeClientes("Paulo"); 
		
		//aqui inserir os parametros faltantes do cartao
		cre.setValidadeCartao(sdf.parse("01/01/2019")); 
		
		//imprimir os resultados dos valores adcionados nos comandos acima.
		System.out.println("O Cliente "+cre.cliente.getNomeClientes()+ " com codigo "
				+cre.cliente.getCodigoClientes() + " e numero do cartao "+cre.getNumeroCartao()+
				" com validade ate "+sdf.format(cre.getValidadeCartao()));
		
	}
}
