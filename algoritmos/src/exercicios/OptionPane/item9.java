package exercicios.OptionPane;
//imprima apenas números múltiplos de 3, do número digitado pelo usuário;

import javax.swing.JOptionPane;

public class item9 {
	
	public static void main(String[] args) {
		
	int Num_a = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de meses"));
	for(int a = 1; a <= Num_a; a++){
		if(a %3 == 0){
			System.out.println("numero multiplo de 2: " +a);
		}
	}
}
}
