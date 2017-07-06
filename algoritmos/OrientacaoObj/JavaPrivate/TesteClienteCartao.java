package JavaPrivate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartao {
	
	public static void main(String[] args) throws ParseException  {
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");//serve para formatar a forma que o salario sera apresentado no console
		/*mesmo problema apresentado no teste agenciabanco por que eu não defini  os parametros no construtor.
		 * na criação do novo cartao precisamos agora entre parenteses colocar o numero do cartao pois criamos um construtos que precisa desse 
		 * parametro para funcionar corretamente*/
		CartaoDeCredito cre = new CartaoDeCredito(12235654);
		ClientesBanco cli = new ClientesBanco();
		cre.cliente = cli;//vincular o cartao ao cliente
		
		//inserir parametros do vinculo que criamos entre as tabelas
		cre.cliente.codigoClientes = 1;
		cre.cliente.nomeClientes = "Paulo";
		//aqui inserir os parametros faltantes do cartao
		cre.validadeCartao = sdf.parse("01/01/2019");
		//imprimir os resultados dos valores adcionados nos comandos acima.
		System.out.println("O Cliente "+cre.cliente.nomeClientes+ " com codigo "
				+cre.cliente.codigoClientes + " e numero do cartao "+cre.numeroCartao+
				" com validade ate "+sdf.format(cre.validadeCartao));
		
	}
}
