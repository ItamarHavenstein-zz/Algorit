package exercicios.CondeInter;
/*3. Peça para o usuário digitar dois números, pegue os dois números que o usuário digitou. 
 * Multiplique os dois números. Se o resultado da multiplicação for múltiplo de 5 imprima 
 * “o resultado é múltiplo de 5”, caso contrário, imprima “o resultado não foi o esperado”. 
 * Após o teste da da condição do if, imprima o resultado da multiplicação.*/

//import javax.swing.JOptionPane;
import java.util.Scanner;

public class Item3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Num_1;
		System.out.print("Digite um numero: ");
		Num_1 = scanner.nextInt();
		
		int Num_2;
		System.out.print("Digite outro numero: ");
		Num_2 = scanner.nextInt();
		
		int Mult = Num_1 * Num_2;
		if(Mult == 0){
			System.out.println("O resultado é zero");
		}else{if(Mult % 5 ==0){
			System.out.println("O resultado é multiplo de 5");
		}else{
			System.out.println("O resultado não foi o esperado");
		}
		scanner.close();
	}
}}
