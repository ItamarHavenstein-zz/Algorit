package Orientacao_a_Objetos;

import java.text.DecimalFormat;

public class TesteAgenciaConta {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		AgenciaBanco agencia = new AgenciaBanco();

		Conta conta = new Conta();//cria a conta
		conta.numeroConta = "123456";
		conta.saldoConta = 123.34d;
		conta.numero = agencia;//vincula conta com a agenciaBanco
	
		conta.numero.numeroAgencia = 1234;
		
		System.out.println("O numero da conta "+conta.numeroConta+" da agência "
				+conta.numero.numeroAgencia+" tem saldo de "+df.format(conta.saldoConta)+".");
		
	}
}
