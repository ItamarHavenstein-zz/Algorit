package exercicios.OptionPane;
//8) Imprima apenas número múltiplos de 2, de 0 até o número digitado pelo usuário;

import javax.swing.JOptionPane;

public class item8 {

	public static void main(String[] args) {
		
	int Num_a = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de meses"));
	for(int a = 1; a <= Num_a; a++){
		if(a %2 == 0){
			System.out.println("numero multiplo de 2: " +a);
			
		}
	}
	}
}	
