package JavaPrivate;

import java.util.Scanner;

public class TesteFuncionario2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	//crio o funcionario, faço o programa pedir para que eu escreva o um nome
		FuncionarioEscola funcionario = new FuncionarioEscola();
		System.out.println("Informe o nome do funcionário:");
		//criar um construtor para receber e alterar o nome
		funcionario.alteranome(scanner.nextLine());
		
		//criar um variavel de valor 1 para acessar o menu while
		int funcao = 1;
		//menu while para fazer ao comandos que precisamos alterar e se colocar 0 saira do menu while
		while(funcao != 0){
			System.out.println("Qual a operação deseja realizar (1-Alterar nome, 2-Alterar salário, 3-Visualizar os dados, 0-Encerrar");
			funcao = Integer.parseInt(scanner.nextLine());
			switch (funcao) {
			case 0:
				break;
			case 1:
				System.out.println("Qual o nome?");
				funcionario.nomeFun(scanner.nextLine());
				break;
			case 2:
				System.out.println("Qual o sálario?");
				funcionario.salarioFun(Double.parseDouble(scanner.nextLine()));
				break;
			case 3:
				System.out.println(funcionario.info());
				break;
			default:
				System.out.println("Operação inválida!");
				break;
			}
		}
		
		scanner.close();
}}
