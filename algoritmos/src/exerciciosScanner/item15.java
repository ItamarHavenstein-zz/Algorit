package exerciciosScanner;
/*15. Vamos considerar que temos que validar um campo texto de uma tela de cadastro de pessoa, 
 * no qual é um campo de observação. Caso a quantidade de caracteres que o usuário digitou for maior que 50, 
 * imprima false, caso contrário imprima true.*/


import java.util.Scanner;

public class item15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String Texto;
		System.out.println("Escreva um texto:");
		Texto = scanner.nextLine();
		
		//System.out.println(Texto.length());
		int NumTex= Texto.length();
		if(NumTex > 50){
			System.out.println("False");
		}else{
			System.out.println("True");
		}
		scanner.close();
	}
}
