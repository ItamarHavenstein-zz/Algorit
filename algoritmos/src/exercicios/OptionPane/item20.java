package exercicios.OptionPane;
/*20) Perguntar para o usuário o início da lista e 
 * o final da lista que ele quer se seja impressa e imprimir esta lista.*/

import javax.swing.JOptionPane;

public class item20 {
	
	public static void main(String[] args) {
		int Num_a = Integer.parseInt(JOptionPane.showInputDialog("Digite o inicio da lista:"));
		int Num_b = Integer.parseInt(JOptionPane.showInputDialog("Digite o fim da lista"));
		for( int a = Num_a; a <= Num_b; a++){
			System.out.println(" lista " +a);
			//JOptionPane.showMessageDialog(null,"lista " +a);
		}
	}
}
