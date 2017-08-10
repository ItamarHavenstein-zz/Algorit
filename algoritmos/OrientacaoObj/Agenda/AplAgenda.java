package Agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplAgenda {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<ContatoTelefone> lista = new ArrayList();
		int valor = 0;
		System.out.println("Bem Vindo");
		while (valor != 1) {
		
			System.out.println("Menu:\n1-Sair, 2- Adicionar Contatos, 3- Mostrar Contatos");
			valor = scanner.nextInt();
			if (valor == 2) {
				System.out.println("Qual tipo de Contato: \n4-Residencial\n3-Comercial\n2-Celular\n1-E-mail");
				int tipo = scanner.nextInt();
				if (tipo == 4) {
					System.out.println("Digite o nome:");
					String nome = scanner.next();
					System.out.println("Digite o Contato");
					String contato = scanner.next();
					lista.add(new ContatoTelefoneResidencial(nome, contato));
				}
				if (tipo == 3) {
					System.out.println("Digite o nome:");
					String nome1 = scanner.next();
					System.out.println("Digite o Contato");
					String contato1 = scanner.next();
					lista.add(new ContatoTelefoneComercial(nome1, contato1));
				}
				if (tipo == 2) {
					System.out.println("Digite o nome:");
					String nome2 = scanner.next();
					System.out.println("Digite o Contato");
					String contato2 = scanner.next();
					lista.add(new ContatoTelefoneCelular(nome2, contato2));
				}if(tipo == 1){
					System.out.println("Digite o nome: ");
					String nome3 = scanner.next();
					System.out.println("Digite o E-mail: ");
					String email = scanner.next();
					lista.add(new ContatoTelefoneCelular(nome3, email));
				}
			}
			if (valor == 3) {
				for (ContatoTelefone contatoTelefone : lista) {
					System.out.println(contatoTelefone.ListaContatos());

				}
			}
		}

		scanner.close();
	}
}
