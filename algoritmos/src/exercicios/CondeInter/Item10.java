package exercicios.CondeInter;
/*12. Escreve um algoritmo que o usuário entre com três números, 
 * e imprima os números em ordem decrescente.*/

import javax.swing.JOptionPane;

public class Item10 {

	public static void main(String[] args) {
		int num_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int num_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		int num_3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um numero"));
		
		int maior_1;
		int maior_2;
		int menor_1;
		int menor_2;
		int b;
		int c;
		
		if(num_1>num_2){
			maior_1 = num_1;
			menor_1 = num_2;
		}else{
			maior_1 = num_2;
			menor_1 = num_1;
		}
		if(maior_1 > num_3){
			maior_2 = maior_1;
			menor_2 = num_3;
		}else{
			maior_2 = num_3;
			menor_2 = maior_1;
		}
		if(menor_1 > menor_2){
			b = menor_1;
			c = menor_2;
		}else{
			b =menor_2;
			c =menor_1;
		}
		int a = maior_2;
		System.out.println("Em ordem decrescente: " +a+" "+b+" "+c);
	}
}
