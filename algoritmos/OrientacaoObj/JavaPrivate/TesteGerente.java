package JavaPrivate;

import java.text.DecimalFormat;

public class TesteGerente {

	public static void main(String[] args) {
		//para formatar o valor de saída do salario
		DecimalFormat df = new DecimalFormat("#0.00");
		
		//inserção de valores
		Gerente ger = new Gerente();
		ger.setNomeBoss("Marcos");
		ger.setSalarioBoss(1000d);
		
		//aplicação do metodo, colocando aumento de salario de (15) por cento
		ger.aumentoBoss(15);
		//impressão do resultado apos o aumento de salario
			System.out.println("Salario do gerente "+df.format(ger.getSalarioBoss())+"R$");
		
		//inserção de valores novos para outro gerente
		Gerente ger1 = new Gerente();
		ger1.setNomeBoss("Antonio"); 
		ger1.setSalarioBoss(900d);
		
		//aplicando o metodo a uma taxa fixa de 10 por cento
		ger1.aumentoBoss();
		//impressão do salario novo
			System.out.println("Salario do gerente "+df.format(ger1.getSalarioBoss())+"R$");
	}
}
