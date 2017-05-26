package exercicios.CondeInter;
/*4. Peça para o usuário digitar dois números, pegue os dois números que o usuário digitou. 
 * Se o primeiro número que o usuário digitar e o segundo número que o usuário digitou forem múltiplos de 7, 
imprima “os dois números são múltiplos de 7”, caso contrário imprima, “os dois números não são múltiplos de 7”. */

import javax.swing.JOptionPane;

public class Item4 {
	
	public static void main(String[] args) {
		int Num_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int Num_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		if(Num_1%7==0 && Num_2%7==0){
			JOptionPane.showMessageDialog(null,"Os 2 numeros são multiplos de 7");
		}else{
			JOptionPane.showMessageDialog(null,"Os 2 numeros não são multiplos de 7");
		}
		
	}
}
