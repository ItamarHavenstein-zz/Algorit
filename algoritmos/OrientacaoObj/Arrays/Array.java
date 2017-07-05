package Arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//criando um array de 10 posições
		int[] aux = new int[10];
		//inserindo valores no array utilizando o for
		for (int a = 0; a < 10; a++) {
			aux[a] = a;
			System.out.println(aux[a]);
		}
		//modificando valores dos arrays
		aux[0] = 10;
		aux[5] = 11;
		//utilizando este comando para colocar em ordem ascendente(crescente)
		Arrays.sort(aux);
		//imprimindo o array para conferir se ficou em ordem crescente
        System.out.println("Nosso Array");
		for (int num : aux) {
			System.out.println(num);
		}
		//fazendo a média do nosso array
		int soma = 0;
		for (int b = 0; b < aux.length; b++) {
			soma = soma + aux[b];
		}
		double div = (soma / 10d);
		System.out.println("A média é: " + div);
		
		//descobrindo o maior numero do array
		int maior = 0;
		for (int d = 0; d < aux.length; d++) {
			if (maior < aux[d]);
			maior = aux[d];
		}
		System.out.println("o maior numero é: "+maior);
	}
}


