package Conhecimento;

import java.util.Scanner;

public class Menu2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int valor= 1;

		while (valor != 0) {
			System.out.println("Digite sua opção: 1-Pedidos 2-Historico 3-Caixa 0-Sair");
			int num = scanner.nextInt();

			switch (num) {
			case 1:
				System.out.println("Abrindo a aba Pedidos");
				break;
			case 2:
				System.out.println("Abrindo a aba Histórico");
				break;
			case 3:
				System.out.println("Abrindo a aba Caixa");
				break;
			case 0:
				System.out.println("Saindo do Programa");
				valor = 0;
				break;
			}

		}

		scanner.close();
	}

	}

