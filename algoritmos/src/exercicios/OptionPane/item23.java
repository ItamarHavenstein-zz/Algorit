package exercicios.OptionPane;
/*23) Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
11 11 11 11 11 11 11 11 11 11 11
10 10 10 10 10 10 10 10 10 10  
09 09 09 09 09 09 09 09 09  
08 08 08 08 08 08 08 08  
07 07 07 07 07 07 07 
06 06 06 06 06 06  
05 05 05 05 05  
04 04 04 04  
03 03 03  
02 02  
01  */

import javax.swing.JOptionPane;

public class item23 {

	public static void main(String[] args) {
		
		int N_linhas = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas:"));
		
		 for(int i = 0; i <= N_linhas; N_linhas--) {
			 for(int j = 1; j <= N_linhas; j++) { 
			 if(N_linhas<10){
			    	 System.out.print(" 0" +N_linhas);
			 } else{
				 System.out.print(" " +N_linhas);
			 }}
			 		System.out.println(); 
			  }
	}
}
