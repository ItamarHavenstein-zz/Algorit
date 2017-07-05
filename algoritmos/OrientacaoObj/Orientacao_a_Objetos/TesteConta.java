package Orientacao_a_Objetos;

import java.text.DecimalFormat;

public class TesteConta {
	
	public static void main(String[] args) {
		//serve para formatar os numeros de saida do saldo e do limite da conta.
		DecimalFormat df = new DecimalFormat("#0.00");
				
		Conta conta1 = new Conta();
		conta1.numeroConta = "100";
		conta1.saldoConta = 150.55d;
		System.out.println(" Conta 1: "+conta1.numeroConta+
		" saldo da conta "+df.format(conta1.saldoConta)+
		" limite da Conta "+df.format(conta1.limiteConta));
		
		Conta conta2 = new Conta();
		conta2.numeroConta = "200";
		conta2.saldoConta = 189.55d;
		System.out.println(" Conta 2: "+conta2.numeroConta+
		" saldo da conta "+df.format(conta2.saldoConta)+
		" limite da Conta "+df.format(conta2.limiteConta));
		
		//faz uma ligação entre as classes conta e agenciaBanco
		AgenciaBanco age = new AgenciaBanco();
		conta1.numero = age;
		conta2.numero = age;
		
		//testando metodos deposita,saca e confere saldo total e extrato
		Conta conta3 = new Conta();//criação da nova conta
		conta3.numero = age;//faz a ligação entre a conta3 com a agenciabanco
		//inserindo valores nas variaveis
		conta3.numeroConta = "130";
		conta3.saldoConta = 100.00d;
		conta3.numero.numeroAgencia = 1234;
		
		//mostra saldo disponivel
			System.out.println("Seu saldo "+df.format(conta3.saldoDisponivel()));	
		conta3.deposita(1000);
		//mostra saldo disponivel apos feito o deposito
			System.out.println("Seu saldo "+df.format(conta3.saldoDisponivel())+" apos o deposito.");
		conta3.saca(500.50);
		//mostra saldo disponivel depois do saque feito
			System.out.println("Seu saldo "+df.format(conta3.saldoDisponivel())+" apos o saque");
		
		//mostra o que se encontra no metodo extrato que criamos na classe conta
			System.out.println("O meu extrato "+conta3.extrato());
		
	}
}
