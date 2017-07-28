package CollectionsJava;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TesteConta {

	public static void main(String[] args) {
		//inserindo valor a variavel agencia
		Agencia agencia = new Agencia("10");
		
		//inserindo valor a variavel banco
		Banco banco = new Banco("1125","Privado");
		Banco banco1 = new Banco("1456", "Publico");
		
		//inserindo valor a variavel contacorrente
		ContaCorrente contac = new ContaCorrente("Paulo dos Santos","254698154" , "1234", 1500d,200d);
		ContaCorrente contac1 = new ContaCorrente("Maria das Dores", "654987321", "9876",2000d,215d);
		
		//inserindo valor a variavel a conta poupanca
		ContaPoupanca contap = new ContaPoupanca("Rosa dos Santos","354891422","4561",2356d,3d);
		ContaPoupanca contap1 = new ContaPoupanca("João Dor","321458796","8963",6548d,6d);
		
		//criando um arraylist das contas correntes criadas
		ArrayList<ContaCorrente> lContaCorrente = new ArrayList();
		lContaCorrente.add(contac1);
		lContaCorrente.add(contac);
		
		//criando um arraylist das contas poupancas criadas
		ArrayList<ContaPoupanca> lContaPoupanca = new ArrayList();
		lContaPoupanca.add(contap1);
		lContaPoupanca.add(contap);
		
		//imprimindo o tamanho do arraylist da conta corrente
		System.out.println("O tamanho da Lista de Conta Corrente é: "+lContaCorrente.size());
		
		//imprimindo o tamanho do arraylist da conta poupanca
		System.out.println("O tamanho da lista de Conta Poupança é: "+lContaPoupanca.size());
		
		//removendo da lista utilizando por parametro o objeto da conta corrente
		lContaCorrente.remove(contac1);
		System.out.println("\nDepois de utilizado o comando remove\nO tamanho da Lista de Conta Corrente é: "+lContaCorrente.size());

		//removendo da lista utilizando por parametro o indice da conta corrente
		lContaCorrente.remove(0);
		System.out.println("depois de ter utilizado o comando remove\nO tamanho da Lista de Conta Corrente é: "+lContaCorrente.size());
		
		//removendo da lista utilizando por parametro o objeto da conta poupanca
		lContaPoupanca.remove(contap1);
		System.out.println("\nDepois de ter utilizado  comando remove\nO tamanho da lista de Conta Poupança é: "+lContaPoupanca.size());
		
		//removendo da lista utilizando por parametro o indice da conta poupanca
		lContaPoupanca.remove(0);
		System.out.println("Depois de ter utilizado o comando remove\nO tamanho da lista de Conta Poupança é: "+lContaPoupanca.size());
		
		//inserindo novas contas para testes
		ContaCorrente contac2 = new ContaCorrente("Paulo dos Santos","254698154" , "1234", 1500d,200d);
		ContaCorrente contac3 = new ContaCorrente("Maria das Dores", "654987321", "9876",2000d,215d);
		lContaCorrente.add(contac2);
		lContaCorrente.add(contac3);
		ContaPoupanca contap2 = new ContaPoupanca("Rosa dos Santos","354891422","4561",2356d,3d);
		ContaPoupanca contap3 = new ContaPoupanca("João Dor","321458796","8963",6548d,6d);
		lContaPoupanca.add(contap2);
		lContaPoupanca.add(contap3);
		
		System.out.println("\nValores que foram inseridos nos Arrays: \n");
		//foreach da lista conta corrente, percorrendo seus valores e mostrando no consselo o que tem dentro
		for(ContaCorrente lConta : lContaCorrente) {
        System.out.println(lConta.gerarExtrato());
        }
		
		//foreach da lista conta poupanca, percorrendo seus valores e mostrando no consselo o que tem dentro
		for(ContaPoupanca lconta : lContaPoupanca){
			System.out.println(lconta.gerarExtrato());
		}
		
		//removendo todos os objetos do arraylist  da conta corrente
		lContaCorrente.clear();
		
		//removendo todos os objetos do araylist da conta poupanca
		lContaPoupanca.clear();
		
		System.out.println("\napos a exclusao total dos arrays: \n");
		// converindo para ver se foi removido todos os objetos das contas
		System.out.println("O tamanho do array da Conta Corrente: "+lContaCorrente.size());
		System.out.println("O tamanho do array da Conta Poupanca: "+lContaPoupanca.size());
		
		
		//por que não mostra????
		//for(int i = 0; i < lContaCorrente.size(); i++) {
		//	System.out.println(lContaCorrente.get(i));
			
		
		
		


	}
}
