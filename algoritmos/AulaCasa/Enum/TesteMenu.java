package Enum;

import java.util.Scanner;

public class TesteMenu {

	public static void Menu(Menu opcao) {
		if (opcao == Menu.PEDIDOS) {
			System.out.println("Abrindo a aba Pedidos");
		} else if (opcao == Menu.HISTORICO) {
			System.out.println("Abrindo a aba Historico");
		} else if (opcao == Menu.CAIXA) {
			System.out.println("Abrindo a aba Caixa");
		} else if(opcao == Menu.SAIR){
			System.out.println("Saindo do programa");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor = 1;
		while (valor != 0){
		
		System.out.println("Digite a opção desejada: 1-Pedidos 2-Histórico 3-Caixa 0-Sair.");
		int opcao = scanner.nextInt();
		if(opcao == 1){
			Menu(Menu.PEDIDOS);
		}else if(opcao == 2){
			Menu(Menu.HISTORICO);
		}else if(opcao == 3){
			Menu(Menu.CAIXA);
		}else if(opcao == 0){
			Menu(Menu.SAIR);
			valor = opcao;
		}
		
		
		}
		scanner.close();
	}
}
