package Exercicio.ArrayMatriz;
/*21. Crie um array com 10 posições e peça para o usuário digitar um número e colocar este número no array.
 *  Enquanto o array não tiver chego no final deverá sempre perguntar para o usuário um próximo número 
 *  e inserir no array. Deverá ser utilizar while ou for.*/
import java.util.Scanner;
public class Item21 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] numeros = new int [10];
	int a = 0;
	while(numeros[a] < 8){
		System.out.println("Digite um numero");
		numeros[a] = scanner.nextInt();
		a++;
	}
	scanner.close();
}
}
