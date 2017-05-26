package exercicios.CondeInter;
/*11. Escreve um algoritmo que o usuário entre com três números e imprima o maior número entre eles,
 *  utilizando apenas um System.out.println.*/

import javax.swing.JOptionPane;

public class Item9 {

	public static void main(String[] args) {
		int num_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int num_2 = Integer.parseInt(JOptionPane.showInputDialog("digite outro numero"));
		int num_3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um numero"));
		
		int maior_1;
		int maior_2;
		if (num_1 > num_2){
			maior_1 = num_1;
		}else{
			maior_1 = num_2;
		}
		if (maior_1 > num_3){
			maior_2 = maior_1;
		}else{
			maior_2 = num_3;
		}
		System.out.println("O Maior numero é: "+maior_2);
	}
}
