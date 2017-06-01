package Exercicio.ArrayMatriz;
/*21. Crie um array com 10 posições e peça para o usuário digitar um número e colocar este número no array.
 *  Enquanto o array não tiver chego no final deverá sempre perguntar para o usuário um próximo número 
 *  e inserir no array. Deverá ser utilizar while ou for.*/
/*int a = 0;
while(numeros[a] == numeros[9]){
	System.out.println("Digite um numero");
	numeros[a] = scanner.nextInt();
	a++;*/

import java.util.Scanner;
public class Item21 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] numeros = new int [10];
	int b = 0;
	for(int a =0;a<numeros.length;a++){
		if(a<10){
			System.out.println("Digite um numero");
			numeros[b] = scanner.nextInt();
			b++;
		}
	}
		
	
	
	scanner.close();
}
}
