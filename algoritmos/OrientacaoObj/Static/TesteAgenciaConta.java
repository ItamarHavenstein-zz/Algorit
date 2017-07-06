package Static;

import Orientacao_a_Objetos.AgenciaBanco;

public class TesteAgenciaConta {
	
	public static void main(String[] args) {
		AgenciaBanco age = new AgenciaBanco(1234);

		System.out.println("Qtd de Contas = " + Conta.contador);

		Conta conta = new Conta("123456", 1500.56d);
		System.out.println("Qtd de Contas = " + Conta.contador);
		System.out.println("Id da conta 1 " + conta.idConta);

		Conta conta2 = new Conta("123456", 500d);
		System.out.println("Qtd de Contas = " + Conta.contador);
		System.out.println("Id da conta 2 " + conta2.idConta);

		//Conta.zerarContador();

		System.out.println(Conta.contador);

	}
	
}
