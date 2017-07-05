package Orientacao_a_Objetos;

import java.text.DecimalFormat;

public class TesteGerente {

	public static void main(String[] args) {
		//para formatar o valor de saída do salario
		DecimalFormat df = new DecimalFormat("#0.00");
		
		//inserção de valores
		Gerente ger = new Gerente();
		ger.nomeBoss = "Paulo";
		ger.salarioBoss = 1000.00d;
		
		//aplicação do metodo, colocando aumento de salario de (15) por cento
		ger.aumentoBoss(15);
		//impressão do resultado apos o aumento de salario
			System.out.println("Salario do gerente "+df.format(ger.salarioBoss)+"R$");
		
		//inserção de valores novos para outro gerente
		Gerente ger1 = new Gerente();
		ger1.nomeBoss = "Antonio";
		ger1.salarioBoss = 900.00d;
		
		//aplicando o metodo a uma taxa fixa de 10 por cento
		ger1.aumentoBoss();
		//impressão do salario novo
			System.out.println("Salario do gerente "+df.format(ger1.salarioBoss)+"R$");
	}
}
