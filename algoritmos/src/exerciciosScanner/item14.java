package exerciciosScanner;
/*14. Escreva no console as seguintes questão:
a. Pergunte para o usuário as seguintes questões, as responta e armazene em variáveis.
i. Digite seu nome:
ii. Digite seu ano de nascimento:
iii. Digite seu telefone:
iv. Digite a cidade de nascimento
b. Imprima no console o seguinte texto concatenando as variáveis
i. Meu nome é <nome>, nasci no ano <ano de nascimento>, tenho <idade> anos.
 Se você quiser entrar em contato comigo, pode ligar para o telefone <telefone>. 
 Há esqueci de te dizer aonde eu nasci, foi na cidade de <cidade de nascimento>.*/

import java.util.Scanner;

public class item14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite seu nome");
		nome = scanner.next();
		
		int anoNas;
		System.out.println("Digite seu ano de nascimento");
		anoNas = scanner.nextInt();
		
		String Phone;
		System.out.println("Digite seu telefone");
		Phone = scanner.next();
		
		String cidNas;
		System.out.println("Digite a cidade do seu nascimento");
		cidNas = scanner.next();
		
		int idade = 2017 - anoNas; 
		
		System.out.println("Meu nome é"+" " +nome+", "+"nasci no ano "+anoNas+", "+"tenho"+" " +idade+ " "+"anos.\n" 
							+"Se você quiser entrar em contato comigo, pode ligar para o telefone"+" "+Phone+".\n"
							+"Há esqueci de te dizer aonde eu nasci, foi na cidade de"+" "+cidNas+".");
		
		scanner.close();
	}
}
