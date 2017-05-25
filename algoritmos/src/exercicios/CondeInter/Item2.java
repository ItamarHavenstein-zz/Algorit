package exercicios.CondeInter;
/*2. Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
 * Verifique se o número é ímpar, caso sim, imprima “o valor digitado é ímpar”, 
 * caso contrário imprima “o valor é par”.*/

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Item2 {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.println("Digite um numero");
		Num_1 = scanner.nextInt();
		
		if(Num_1 % 2 == 1){
			System.out.println("Numero é ímpar");
		}else{
			System.out.println("Numero é par");
		}
		scanner.close();*/
		int Num_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		if(Num_1 % 2 == 1){
			JOptionPane.showMessageDialog(null, "Numero é ímpar");
		}else{
			JOptionPane.showMessageDialog(null, "Numero é par");
		}
	}
}
