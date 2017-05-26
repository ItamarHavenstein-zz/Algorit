package exercicios.CondeInter;
/*6. Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça para o usuário digitar 
 * o bairro onde mora, armazene o valor em variável. Com tais informações efetue as seguintes condições:
 * 
a. Verifique se o usuário mora em “Blumenau” e no bairro “Velha”, caso sim, imprima 
“Você se atrasará para o trabalho!”.

b. Verifique se o usuário mora em “Blumenau” e no bairro “Fortaleza”, caso sim, imprima
 “Você se atrasará muito mais para o trabalho!”.
 
c. Verifique se o usuário mora em “Blumenau” e no bairro “Garcia”, caso sim, imprima 
“Você tem que sair de madrugada para não pegar trânsito!”.

d. Verifique se o usuário mora em “Gaspar” e no bairro “Belchior”, caso sim, imprima “OK,
 você gosta de pegar trânsito!”.
 
e. Verifique se o usuário mora em “Blumenau” e no bairro “Bela vista”, caso sim, imprima 
“Pegue carona com quem vêem de Gaspar, economiza gasolina!”.

f. No final peça para o usuário responder a pergunta “Você concorda com o que eu disse?” 
utilizando System.out.println e pegue o que o usuário digitar com Scanner. Caso o usuário
 digitar true, imprima “Show de bola”, caso contrário “Ok, problema é nosso!”.*/

import java.util.Scanner;

public class Item6{

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String Cidade;
			System.out.println("Digite o nome da cidade onde mora");
			Cidade = scanner.nextLine();
			String Bairro;
			System.out.println("Digite o nome do bairro onde mora");
			Bairro = scanner.nextLine();
			String citi_1 = "Blumenau";
			String citi_2 = "Gaspar";
			String bairro_1 = "Velha";
			String bairro_2 = "Fortaleza";
			String bairro_3 = "Garcia";
			String bairro_4 ="Belchior";
			String bairro_5 = "Bela Vista";
			if(Cidade.equals(citi_1) && Bairro.equals(bairro_1) ){
				System.out.println("Você se atrasará para o trabalho!");
			}else{if(Cidade.equals(citi_1)&& Bairro.equals(bairro_2)){
				System.out.println("Você se atrasará muito mais para o trabalho!");
			}else{if(Cidade.equals(citi_1)&& Bairro.equals(bairro_3)){
				System.out.println("Você tem que sair de madrugada para não pegar trânsito!");
			}else{if(Cidade.equals(citi_2)&& Bairro.equals(bairro_4)){
				System.out.println("OK,você gosta de pegar trânsito!");
			}else{if(Cidade.equals(citi_1)&& Bairro.equals(bairro_5)){
				System.out.println("Pegue carona com quem vêem de Gaspar, economiza gasolina!");
			}else{
				System.out.println("Não está em nossa base de dados");
			
			String pergt;
			System.out.println("Você concorda com o que eu disse(verdadeiro ou falso)");
			pergt = scanner.nextLine();
			if(pergt.equals("verdadeiro")){
				System.out.println("Show de bola");
			}else{
				System.out.println("Ok, problema é seu!");
			}
			}
			scanner.close();
		}
		}
	}
	}
}
}
			




			
			
	

