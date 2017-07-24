package JavaPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteExtrato {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Agencia agencia = new Agencia();
		agencia.setAgencia("1234");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo");
		cliente.setRg("1235895");
		cliente.setDataNasc(sdf.parse("10/10/2010"));
		cliente.setCidade("Blumenau");
		
		ContaCorrente contaco = new ContaCorrente();
		contaco.setNumConta("789");
		contaco.setSaldo(1200d);
		contaco.setLimite(200d);
		contaco.setEncargos(10d);
		
		ContaPoupanca contapo = new ContaPoupanca();
		contapo.setNumConta("789/500");
		contapo.setSaldoP(10000d);
		contapo.setJuros(10d);
		
		contaco.setCliente(cliente); 
		contaco.setAgencia(agencia);
		contaco.getExtrato();
		
		System.out.println();
		
	
		
	}
}
