package Geometria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCalculos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/*Quadrados quadro = new Quadrados(10d);
		quadro.CalculoPerimetro();
		System.out.println(quadro.CalculoPerimetro());*/
		
		System.out.println("Quantas formas geometrica deseja fazer");
		int num = scanner.nextInt();
		int laco = 0;

		List<Quadrilateros> lista = new ArrayList();

		while (laco != num) {
			System.out.println("Quais formas geometricas deseja fazer\n1-Quadrado, 2-Retangulo, 3-Circulo");
			int opcao = scanner.nextInt();

			if (opcao == 1) {
				System.out.println("digite o lado do Quadrado");
				double lado = scanner.nextDouble();
				lista.add(new Quadrados(lado));
				laco++;
			
			}
			if (opcao == 2) {

				laco++;
				
			}
			if (opcao == 3) {

				laco++;
				

			}

		}
		
			for (Quadrilateros quadrado: lista) {
				
				System.out.println(quadrado.CalculoArea());
			
		
		scanner.close();
		}
	}
}
