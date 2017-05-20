package exercicios.OptionPane;
/*21) Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
1
1 1  
1 1 1  
1 1 1 1
1 1 1 1 1
1 1 1 1 1 1  */

import javax.swing.JOptionPane;
//import java.util.Random;

public class item21 {

	public static void main(String[] args) {
		int N_linhas = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas:"));
		for(int b = 1; b<= N_linhas; b++){
			
			System.out.println(b);
		}
	}
}
