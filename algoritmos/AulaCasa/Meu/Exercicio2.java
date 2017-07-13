package Meu;
//Imprima a soma de 1 at� 1000.
public class Exercicio2 {

	public static void main(String[] args) {
		int soma = 0;
		for(int aux =1; aux<1001; aux++){
			soma = soma+aux;
		}
		System.out.println("Total da soma de 1 ate 1000: "+soma);
	}
}
