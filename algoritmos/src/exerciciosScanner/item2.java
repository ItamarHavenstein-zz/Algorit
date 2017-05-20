package exerciciosScanner;/*2.	Escreva no console para digitar um texto,
 leia o texto digitado e imprima o texto no console. */

import java.util.Scanner;//biblioteca do Scanner

public class item2 {//Integer.toString() transforma valor para string
					//scanner.next() le o que vc escreveu na pergunta que no caso o valor é string
					//scanner.nextInt() le o que escreveu que neste caso seria uma int

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		String Texto;
		 System.out.println("Escreva seu nome");
		  Texto = scanner.next();
		  
		  System.out.println("Seu nome é:"+Texto);
		  
		  scanner.close();
				 
		 
	}
}
