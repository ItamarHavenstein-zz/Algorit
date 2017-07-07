package Static;

import Orientacao_a_Objetos.AgenciaBanco;

public class TesteAgenciaConta {
	
	public static void main(String[] args) {
		AgenciaBanco agencia = new AgenciaBanco(1234);
		
		//mostra quantas contas tenho criadas ate o momento
		System.out.println("Qtd de Contas = " + Conta.contador);
		
		//criando uma conta
		Conta conta = new Conta();
		conta.setNumeroConta("123456");
		conta.setSaldoConta(1500d);
		//imprimindo novamente quantas contas foram criadas
		System.out.println("Qtd de Contas = " + Conta.contador);
		//mostra qual é o id da conta 1
		System.out.println("Id da conta 1 " + conta.getIdConta());

		//criando a segunda conta
		Conta conta2 = new Conta();
		conta2.setSaldoConta(1500d);
		//imprimimdo novamente quantas contas eu criei
		System.out.println("Qtd de Contas = " + Conta.contador);
		//mostra o id da segunda conta
		System.out.println("Id da conta 2 " + conta2.getIdConta());

		//metodo criado na classe conta para zerar o contador, mostra quantas contas criadas ate o momento e depois zera o contador
		//Conta.zerarContador();

		//pedimos para imprimir a variavel contador para ver se o contador está em zero
		System.out.println("Qtd de contas: "+Conta.contador+" criadas");

		//por que nao esta funcionando.R: precisa colocar o conta.contador++ dentro do construtor conta(numero,saldo) ai vai funcionar
		Conta conta3 = new Conta("12345", 1200d);
		System.out.println("Qtd de Contas = "+Conta.contador);
	
	}
	
}
