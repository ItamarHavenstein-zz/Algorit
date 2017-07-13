package Meu;
//Imprima os fatoriais de 1 a 10.
public class Exercicio4 {

	public static void main(String[] args) {
		/*um numero fatorial é se no caso for 5!= 5*4*3*2*1 = 120, como mostrado fatorial é um numero vezes os numeros ate 1, 
		 * se fosse 6 seria 6*5*4*3*2*1=720 */
		int fatorial = 1;
		int valor = 10;
		for(int aux = 2; aux<=valor; aux++){
			fatorial *= aux;
			System.out.println("o fatorial de "+aux+ " é igual a "+fatorial);
		}
		
	}
}
