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

		//criação do funcionario
		FuncionarioEscola fun1 = new FuncionarioEscola();
		fun1.nomeFun = "Pedro";
		fun1.salarioFun = 1435.98d;
		//imprime as informações criadas anteriormente
		System.out.println("nome do funcionario " + fun1.nomeFun + " com salario " + df.format(fun1.salarioFun) + "$");

		//criação do funcionario
		FuncionarioEscola fun2 = new FuncionarioEscola();
		fun2.nomeFun = "José";
		fun2.salarioFun = 1643.54d;
		//imprime as informações criadas anteriormente
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
		
		//imprime as informações do metodo pré-configurado para apresentar nome e salario
		System.out.println(fun4.info()+"\n"+fun5.info());
		
		//Criação de novo funcionario
		FuncionarioEscola  fun6 = new FuncionarioEscola();
		fun6.nomeFun = "Mario";
		/*como eu coloquei a variavel valerefeicao com um valor padrao entao não 
		 * preciso colocar o valor do vale refeição pois ja está definido*/
		//fun6.valeRefeicao = 10.00d;
		
		//imprime as informações do meu metodo que esta pré-configurado para apresentar nome,salario e vale refeição
		System.out.println("\n"+fun6.info());
		
		//criação de novo funcionario
		FuncionarioEscola fun7 = new FuncionarioEscola();
		fun7.nomeFun = "Romario";
		//usado para calcular o aumento no vale refeição diario
		fun7.ValeRefeicao(10);
		
		//imprime as informações.
		System.out.println(fun7.info());
	}
}
