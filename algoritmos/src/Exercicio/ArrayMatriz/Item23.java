package Exercicio.ArrayMatriz;

import java.util.Scanner;

/*23. Crie um array de 6 posições com os valores 1, 2, 3, 4, 5, 6. Percorra o array procurando um valor par,
 *  se encontado deve ser perguntado para o usuário um novo valor para substituir o valor presente no array.*/

public class Item23 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] valor = new int[6];
	valor[0]= 1;
	valor[1]= 2;
	valor[2]= 3;
	valor[3]= 4;
	valor[4]= 5;
	valor[5]= 6;
	System.out.println("Lista antes da substituição\n");
	for(int aux2 =0;aux2<valor.length;aux2++){
		System.out.println(valor[aux2]);
	}
	for(int aux =0;aux<valor.length;aux++){
		if(valor[aux]%2==0){
			System.out.println("Digite um numero substituto");
			int subs = scanner.nextInt();
			valor[aux]=subs;
		}
	}
	System.out.println("Lista depois da substituição\n");
	for(int aux1 =0;aux1<valor.length;aux1++){
		System.out.println(valor[aux1]);
	}
	scanner.close();
}
}
