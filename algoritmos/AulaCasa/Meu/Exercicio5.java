package Meu;

public class Exercicio5 {

	public static void main(String[] args) {
		long fat = 1l;
		int valor = 30;
		for(int aux = 1; aux<=valor; aux++){
			fat *= aux;
			System.out.println("o Fatorial dé "+aux+" é igual a " +fat);
		}
	}
}
