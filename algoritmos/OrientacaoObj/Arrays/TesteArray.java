package Arrays;

import java.util.Arrays;

public class TesteArray {

	public static void main(String[] args) {
		//inserindo valores nos arrays
		int [] numeros = {1,23,4,3,7,10,9,7,98,43};
		
		//imprimindo os valores em ordem de inserção
		for(int num : numeros){
		System.out.println(num);
		}
		
		//colocando os valores do array em ordem ascendente(crescente)
		Arrays.sort(numeros);
		
		//imprimimdo os valores do array para ver se ficaram em ordem
		for(int num1 : numeros){
			System.out.println(num1);
		}
	}
}
