package Agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplAgenda {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<ContatoTelefone> lista = new ArrayList();
		int valor = 0;
		System.out.println(" BEM VINDO ");
		while (valor != 1) {

			System.out.println("\nMenu:\n1-Sair, 2- Adicionar Contatos, 3- Mostrar Contatos, 4-Buscar Contato");
			valor = scanner.nextInt();
			if (valor == 2) {
				int valor1 = 1;
				while (valor1 != 0) {
					System.out.println(
							"Qual tipo de Contato: \n4-Residencial\n3-Comercial\n2-Celular\n1-E-mail\n0-Voltar");
					valor1 = scanner.nextInt();
					if (valor1 == 4) {
						System.out.println("Digite o nome:");
						String nome = scanner.next();
						System.out.println("Digite o Contato");
						String contato = scanner.next();
						lista.add(new ContatoTelefoneResidencial(nome, contato));
					}
					if (valor1 == 3) {
						System.out.println("Digite o nome:");
						String nome1 = scanner.next();
						System.out.println("Digite o Contato");
						String contato1 = scanner.next();
						lista.add(new ContatoTelefoneComercial(nome1, contato1));
					}
					if (valor1 == 2) {
						System.out.println("Digite o nome:");
						String nome2 = scanner.next();
						System.out.println("Digite o Contato");
						String contato2 = scanner.next();
						lista.add(new ContatoTelefoneCelular(nome2, contato2));
					}
					if (valor1 == 1) {
						System.out.println("Digite o nome: ");
						String nome3 = scanner.next();
						System.out.println("Digite o E-mail: ");
						String email = scanner.next();
						lista.add(new ContatoEmail(nome3, email));
					}
				}
			}
			if (valor == 3) {
				int valor2 = 0;
				while (valor2 != 1) {
					System.out.println("1- Voltar, 2-Todos, 3-Por Posição[1-9]");
					valor2 = scanner.nextInt();
					if (valor2 == 2) {
						for (ContatoTelefone contatoTelefone : lista) {
							System.out.println(contatoTelefone.ListaContatos());
						}
					}
					if (valor2 == 3) {
						System.out.println("insira a posição [0-9]");
						String indice = scanner.next();
						if (indice.matches("[0-9]+")) {
							int i = Integer.parseInt(indice);
							//verifica se o indice existe na lista
							if (i < lista.size()) {
								System.out.println(lista.get(i).ListaContatos());
							}
						}
					}
				}
			}
			if (valor == 4) {
				int valor3 = 0;
				while (valor3 != 1) {
					System.out.println("Buscar por: 1-Voltar, 2-Nome, 3-Contato Telefone, 4-E-mail");
					valor3 = scanner.nextInt();
					if (valor3 == 2) {
						System.out.println("Digite o nome: ");
						String nome = scanner.next();
						int aux = 0;
						for (ContatoTelefone contac : lista) {
							if (contac.getNome().length() == nome.length()) {
								System.out.println("Resultado encontrado\n" + contac.ListaContatos());
								aux++;
							}
						}
						if (aux < 1) {
							System.out.println("\nNão Encontrado\n");
						}
					}
					if (valor3 == 3) {
						System.out.println("Digite o Numero do Telefone: ");
						String contato = scanner.next();
						int aux1 = 0;
						for (ContatoTelefone contac : lista) {
							if (contac.getContato().equals(contato)) {
								System.out.println("Resultado Encontrado\n" + contac.ListaContatos());
								aux1++;
							}
						}
						if (aux1 < 1) {
							System.out.println("Não Encontrado");
						}
					}
					if (valor3 == 4) {
						System.out.println("Digite o E-mail: ");
						String email = scanner.next();
						int aux1 = 0;
						for (ContatoTelefone contac : lista) {
							if (contac.getContato().length() == email.length()) {
								System.out.println("Resultado encontrado\n" + contac.ListaContatos());
								aux1++;
							}
						}
						if (aux1 < 1) {
							System.out.println("\nNão Encontrado\n");
						}
					}
				}
			}
		}

		scanner.close();
	}
}
