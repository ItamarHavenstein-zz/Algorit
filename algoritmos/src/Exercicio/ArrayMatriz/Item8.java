package Exercicio.ArrayMatriz;
/*8. Criar um array do tipo int, com os seguintes valores 1, 2, 3, 4, 5.
a. Imprimir todos os valores do array até chegar a metade do array.
b. Alterar o valor do início do array para 10.
c. Alterar o valor da última posição do array para 10. 
d. Imprimir todos os valores do array.
*/

public class Item8 {
public static void main(String[] args) {
	int[] num = new int[5];
	num[0]=1;
	num[1]=2;
	num[2]=3;
	num[3]=4;
	num[4]=5;
	int quant=0;
	for(int a=0;a <= num.length;a++){
		quant++;
	}
	int div = quant/2;
	for(int a =0;a<div;a++){
		System.out.println("A) "+num[a]);
	}
	System.out.println();
	num[0]=10;
	for(int a=0;a < num.length;a++){
		System.out.println("B) "+num[a]);
	}
	System.out.println();
	num[4]=10;
	for(int a=0;a < num.length;a++){
		System.out.println("C) "+num[a]);
	}
	System.out.println();
	for(int a=0;a < num.length;a++){
		System.out.println("D) "+num[a]);
	}
}
}
