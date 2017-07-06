package JavaPrivate;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		// serve para formatar os numeros de saida do saldo e do limite da
		// conta.
		DecimalFormat df = new DecimalFormat("#0.00");

		// metodo padrao para configurar cada valor
		Conta conta1 = new Conta();// metodo padrao
		conta1.numeroConta = "10";
		conta1.saldoConta = 150.45d;
		System.out.println(" Conta 1: " + conta1.numeroConta + " saldo da conta " + df.format(conta1.saldoConta)
				+ " limite da Conta " + df.format(conta1.limiteConta));

		Conta conta2 = new Conta("200", 189.55d);// construtor
		System.out.println(" Conta 2: " + conta2.numeroConta + " saldo da conta " + df.format(conta2.saldoConta)
				+ " limite da Conta " + df.format(conta2.limiteConta));

		// faz uma ligação entre as classes conta e agenciaBanco
		AgenciaBanco age = new AgenciaBanco(1234);
		conta1.numero = age;
		conta2.numero = age;

		// testando metodos deposita,saca e confere saldo total e extrato
		Conta conta3 = new Conta("130", 100.00d);// construtor
		conta3.numero = age;// faz a ligação entre a conta3 com a agenciabanco
		// inserindo valores nas variaveis
		// conta3.numeroConta = "130";
		// conta3.saldoConta = 100.00d;

		// mostra saldo disponivel
		System.out.println("Seu saldo " + df.format(conta3.saldoDisponivel()));
		conta3.deposita(1000);
		// mostra saldo disponivel apos feito o deposito
		System.out.println("Seu saldo " + df.format(conta3.saldoDisponivel()) + " apos o deposito.");
		conta3.saca(500.50);
		// mostra saldo disponivel depois do saque feito
		System.out.println("Seu saldo " + df.format(conta3.saldoDisponivel()) + " apos o saque");

		// mostra o que se encontra no metodo extrato que criamos na classe
		// conta
		System.out.println("O meu extrato " + conta3.extrato());

		// criação de uma nova conta utilizando o construtor criado na clase
		// conta
		/*
		 * utilizando o construtor você coloca os valores de numero conta e
		 * saldo no escopo do construtor,com isso não precisamos utilizar esses
		 * dois comandos (conta3.numeroConta = "130"; conta3.saldoConta =
		 * 100.00d;)
		 */
		Conta conta4 = new Conta("130", 100.00d);// criação da nova conta
													// utilizando construtor
		conta4.numero = age;// faz a ligação entre a conta4 com a agenciabanco
		// imprimindo todos os valores atribuidos para conta,saldo,numerodeconta
		// e agencia
		System.out.println("O numero da conta: " + conta4.numeroConta + " com saldo de " + df.format(conta4.saldoConta)
				+ " tendo limite da conta de " + df.format(conta4.limiteConta) + " da agencia "
				+ conta4.numero.numeroAgencia);
		// utilizando o metodo criado na classe conta, onde pre-configuramos o
		// que queriamos mostrar.
		System.out.println(conta4.extrato());

		// testando a transferencia
		AgenciaBanco agencia = new AgenciaBanco(9876);
		Conta conta5 = new Conta("352", 1000.00d);
		Conta conta6 = new Conta("452", 800.00d);
		conta6.numero = agencia;
		conta5.numero = agencia;
		
		//imprimindo o extrato das contas
		System.out.println(conta5.extrato());
		System.out.println(conta6.extrato());
		
		/*utilizando o construtor para transferencia de valores para outra conta,
		 * no caso primeiro escrever da conta que vc vai retirar o valor e depois dentro do metodo vc coloca para onde vai e qual é o valor
		 * da transferencia entre as contas.*/
		conta5.transfere(conta6, 200.00d);
		
		System.out.println("numero da conta "+conta5.numeroConta+" saldo "+conta5.saldoConta+
				"\nnumero da conta "+conta6.numeroConta+" saldo "+conta6.saldoConta);

	}
}
