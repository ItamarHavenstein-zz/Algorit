package exercicios.CondeInter;
/*18. Pergunte o nome da pessoa, o dia e mês e ano de aniversário. 
 * Pergunte para outra pessoa o nome, o dia, mês e ano de aniversário. 
 * Agora verifique qual é a pessoa mais velha, e imprima o nome da mais velha e o nome da mais nova, 
 * utilizando apenas um Sysout. Sendo considerado o dia, mês e ano, cada uma sendo uma variável int.*/

import javax.swing.JOptionPane;

public class Item16 {

	public static void main(String[] args) {
		String nome_1 = JOptionPane.showInputDialog("Digite seu nome");
		int dia_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu dia de aniversário"));
		int mes_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de seu aniversário"));
		int ano_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento"));
		String nome_2 = JOptionPane.showInputDialog("Digite seu nome");
		int dia_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu dia de aniversário"));
		int mes_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de seu aniversário"));
		int ano_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento"));
		
		
	}
}
