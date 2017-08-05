package Geometria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCalculos {
	
	public static void main(String[] args) {
		Quadrados quadro = new Quadrados(10d);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantas formas geometrica deseja fazer");
		int num = scanner.nextInt();
		int laco = 0;
		double[] quadra = new double[5];
		List<Quadrados> quadrado = new ArrayList();
		quadrado.add(quadro);
		while (laco != num)
			for (int aux = 0; aux <= num;) {
				System.out.println("Quais formas geometricas deseja fazer\n1-Quadrado, 2-Retangulo, 3-Circulo");
				int opcao = scanner.nextInt();
				
				if (opcao == 1) {
					System.out.println("digite o lado do Quadrado");
					double lado = scanner.nextDouble();
					
					quadrado.addAll(lado);
					
					laco++;
					break;
				}
				if (opcao == 2) {
					
					laco++;
					break;
				}
				if (opcao == 3) {

					laco++;
					break;
					
				}
				
			}
		while(laco == num){
			
			System.out.println();
			System.out.println(quadra[1]);
			break;
		}
		scanner.close();
	}
}
