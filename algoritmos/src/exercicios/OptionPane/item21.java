package exercicios.OptionPane;
/*21) Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
1
1 1  
1 1 1  
1 1 1 1
1 1 1 1 1
1 1 1 1 1 1  */

import javax.swing.JOptionPane;


public class item21 {

	public static void main(String[] args) {
		int N_linhas = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas:"));
		 for(int i = 0; i < N_linhas; i++) {
			 for(int j = 0; j <= i; j++) { 
				 System.out.print("1");}
			 System.out.println(); 
			 }
		
		}
}
