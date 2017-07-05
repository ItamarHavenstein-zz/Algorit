package Orientacao_a_Objetos;

public class TesteAgenciaConta {
	
	public static void main(String[] args) {
		AgenciaBanco agencia = new AgenciaBanco();
		agencia.numeroAgencia = 1234;

		Conta conta = new Conta();
		conta.numeroConta = "123456";
		conta.saldoConta = 123.34d;
		
		conta.numero = agencia;
		//falta fazer para imprimir
		System.out.println();
		
	}
}
