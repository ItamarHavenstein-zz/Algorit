package Exercicio.ArrayMatriz;
/*26. Criar uma matriz com 3 linhas e 3 colunas. Popular esta matriz da forma tradicional 
 * (matriz[0][0] = 1;) com os valores desejados. Utilizando for, 
 * efetuar a soma dos valores de cada coluna e imprimir apenas os valores somados da coluna.
 *  Ou seja, conforme matriz abaixo:
	    3 3 3
		2 2 2
		1 1 1

	Imprimir no console deve aparecer o seguinte resultado:
		Soma da coluna 0: 6
		Soma da coluna 1: 6
		Soma da coluna 2: 6*/
public class Item26 {
public static void main(String[] args) {
	int[][][] matriz = new int[3][3][3];
	matriz[0][0][0]=3;
	matriz[1][1][1]=2;
	matriz[2][2][2]=1;
	int coluna1=0;
	for(int aux=0;aux<matriz.length;aux++)
			coluna1 = (matriz[0][0][0])+(matriz[1][1][1])+(matriz[2][2][2]);
			System.out.println("Soma da coluna 1= "+coluna1+"\nSoma da coluna 2= "+coluna1+
			"\nSoma da coluna 3= "+coluna1);
}
}



