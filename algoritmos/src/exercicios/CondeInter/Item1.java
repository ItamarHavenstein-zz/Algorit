package exercicios.CondeInter;
/*1. Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
 * Verifique se o número é maior que 10, caso sim, imprima “o valor digitado é maior que 10”,
 *  caso contrário imprima “o valor digitado é menor que 10”.*/

import java.util.Scanner;
//import javax.swing.JOptionPane;
public class Item1 {

	public static void main(String[] args) {
		/*int Num_a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		if(Num_a > 10){
			JOptionPane.showMessageDialog(null,"Numero maior que 10");
		}else{
			JOptionPane.showMessageDialog(null,"Numero menor ou igual a 10");
		}*/
		Scanner scanner = new Scanner(System.in);
		
		int Num_a;
		System.out.println("Digite um numero");
		Num_a = scanner.nextInt();
		
		if(Num_a>10){
			System.out.println("Numero maior que 10");
		}else{
			System.out.println("Numero menor ou igual a 10");
		}
		scanner.close();
	}
}
