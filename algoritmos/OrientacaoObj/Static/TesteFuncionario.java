package Static;

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

		FuncionarioEscola fun1 = new FuncionarioEscola();
		fun1.nomeFun = "Pedro";
		fun1.salarioFun = 1435.98d;
		System.out.println("nome do funcionario " + fun1.nomeFun + " com salario " + df.format(fun1.salarioFun) + "$");

		FuncionarioEscola fun2 = new FuncionarioEscola();
		fun2.nomeFun = "José";
		fun2.salarioFun = 1643.54d;
		System.out.println(fun2.nomeFun);
		System.out.println(fun2.salarioFun);

		// utilizando os metodos criados na classe funcionarioescola
		FuncionarioEscola fun3 = new FuncionarioEscola();
		fun3.nomeFun = "Mario";
		fun3.salarioFun = 1200.00;
		System.out.println(fun3.info());
		// introduzindo o aumento para o funcionario
		fun3.aumento(350.50);
		// imprimimdo na tela o aumento, utilizando o metodo info criado para
		// mostrar as informações dos funcionarios
		System.out.println("Depois do aumento do " + fun3.info());
		
		//Criação de 2 funcionarios colocando seu nome e seu salario ja esta pre-fixado no metodo chamado
		FuncionarioEscola fun4 = new FuncionarioEscola();
		fun4.nomeFun = "Pedro";
		FuncionarioEscola fun5 = new FuncionarioEscola();
		fun5.nomeFun = "João";
		
		System.out.println(fun4.info()+"\n"+fun5.info());

	}
}
