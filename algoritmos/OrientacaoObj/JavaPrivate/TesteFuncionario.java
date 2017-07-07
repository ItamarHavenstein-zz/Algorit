package JavaPrivate;

import java.text.DecimalFormat;

public class TesteFuncionario {

	/*
	 * 14. Faça uma classe chamada TesteFuncionario e crie dois objetos da
	 * classe Funcionario atribuindo valores a eles. Mostre na tela as
	 * informações desses objetos.
	 */
	public static void main(String[] args) {
		// formatar o salario
		DecimalFormat df = new DecimalFormat("#0.00");

		// criação de um novo funcionario
		FuncionarioEscola fun1 = new FuncionarioEscola();
		fun1.setNomeFun("Pedro");
		fun1.setSalarioFun(1542.25d);
		System.out.println("nome do funcionario " + fun1.getNomeFun() + " com salario " + 
		df.format(fun1.getSalarioFun()) + "R$");

		//criando outro funcionario
		FuncionarioEscola fun2 = new FuncionarioEscola();
		fun2.setNomeFun("José");
		fun2.setSalarioFun(1200d);
		System.out.println(fun2.getNomeFun());
		System.out.println(df.format(fun2.getSalarioFun())+"R$");

		// utilizando os metodos criados na classe funcionarioescola
		FuncionarioEscola fun3 = new FuncionarioEscola();
		fun3.setNomeFun("Mario"); 
		fun3.setSalarioFun(1300d);
		System.out.println(fun3.info());
		// introduzindo o aumento para o funcionario
		fun3.aumento(350.50);
		// imprimimdo na tela o aumento, utilizando o metodo info criado para
		// mostrar as informações dos funcionarios
		System.out.println("Depois do aumento do " + fun3.info());

		// Criação de 2 funcionarios colocando seu nome e seu salario ja esta
		// pre-fixado no metodo chamado
		FuncionarioEscola fun4 = new FuncionarioEscola();
		fun4.setNomeFun("Pedro");
		FuncionarioEscola fun5 = new FuncionarioEscola();
		fun5.setNomeFun("João");

		System.out.println(fun4.info() + "\n" + fun5.info());

	}
}
