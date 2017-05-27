package exercicios.CondeInter;
/*16. Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e sua idade. 
 * Imprima o nome da pessoa mais velha e a idade dela, e o nome da pessoa mais nova e a idade dela, 
 * utilizando apenas um Sysout. Sendo considerado a idade uma variável int.*/

import  javax.swing.JOptionPane;

public class Item14 {

	public static void main(String[] args) {
		String nome_1 = JOptionPane.showInputDialog("Digite seu nome");
		int idade_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		String nome_2 =JOptionPane.showInputDialog("Digite outro nome");
		int idade_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		int a;
		int b;
		
		if(idade_1 > idade_2){
			a = idade_1; 
		}else{
			b = idade_2;
		}
		
	}
}
