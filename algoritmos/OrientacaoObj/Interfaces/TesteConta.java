package Interfaces;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0.00R$");
		
		//inserindo valor para a agencia
		Agencia agencia = new Agencia("125");
		
		//inserindo valores para as variaveis
		ContaCorrente contac = new ContaCorrente();
		contac.setNome("Paulo dos Anjos");
		contac.setNumeroConta("1234");
		contac.setSaldo(1500d);
		contac.setLimite(100d);
		contac.setEncargos(2.50d);
		contac.setAgencia(agencia);
		
		//inserindo valores para as variaveis
		ContaPoupanca contap = new ContaPoupanca();
		contap.setNome("Maria das Dores");
		contap.setNumeroConta("9786");
		contap.setSaldo(2250d);
		contap.setJuros(5d);
		contap.setAgencia(agencia);
		
		//imprime extrato da conta corrente
		contac.gerarExtrato();
		//executa o comando e imprimi o que fez
		contac.deposita(350d);
		//executa o comando e imprime o que fez
		contac.saca(500d);
		
		System.out.println();
		//imprime extrato da conta poupança
		contap.gerarExtrato();
		contap.deposita(621.54d);
		contap.saca(245.54d);
		contap.juros();
		
		
	}
}
