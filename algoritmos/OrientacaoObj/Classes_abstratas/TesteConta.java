package Classes_abstratas;

import java.sql.SQLException;

public class TesteConta {

	public static void main(String[] args) throws Exception {
		ContaCorrente contac = new ContaCorrente("9876","Mario Do Nascimento",12548.55d,200.00d,5.23d);
		ContaPoupanca contap = new ContaPoupanca("1234", "Marcos Palmeira",5000.00d,50.21d);
		
		
		/*caso a classe que definimos como contas está configurada como abstrata, o  software não deixa compilar pois estamos fazendo um
		uma coisa errada perrante o software
		Contas c = new Contas();
		c.setNumeroConta("9654");*/
		
		contac.imprimiExtratoDetalhado();
		System.out.println();
		contap.imprimiExtratoDetalhado();
		/*
		 * contap.deposita(0); Se utilizarmos este comando para quando nosso usuario escrever um valor
		 * menor ou igual a zero irá aparecer este texto abaixo,
		 * Exception in thread "main" java.lang.IllegalArgumentException
	at Classes_abstratas.ContaPoupanca.deposita(ContaPoupanca.java:47)
	at Classes_abstratas.TesteConta.main(TesteConta.java:18)
	para ficar mais realista o nosso teste temos que capturar o problema e mostrar para o usuario 
	o que ele fex de errado*/
		
		//no comando a seguir capturamos o erro e informamos para o usuario o que ele fex de errado
		try {
		     contap.deposita(-1);
		} catch (IllegalArgumentException e) {
		     System.out.println ("O deposito precisa ser maior que zero.");
		}
		/*usando o Exception o aviso é mostrado logo apos Exception in thread "main" java.lang.Exception:
		 * mas fica claro apenas para a pessoa que está testando outra pessoa que não conhece não saberia o que fazer.
		 * Exception in thread "main" java.lang.Exception: O saque precisa ser maior que Zero
	at Classes_abstratas.ContaCorrente.saca(ContaCorrente.java:66)
	at Classes_abstratas.TesteConta.main(TesteConta.java:35)*/
		
		contac.saca(0);
		
		

		
	}
}
