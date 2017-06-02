package Exercicio.ArrayMatriz;
/*25. Criar uma matriz com 3 linhas e 3 colunas. Popular esta matriz da forma tradicional
 *  (matriz[0][0] = 1;) com os valores desejados. Utilizando for, 
 *  efetuar a soma dos valores de cada linha e imprimir apenas os valores somados da linha.
 *   Ou seja, conforme matriz abaixo:
	    3 3 3
		2 2 2
		1 1 1

	Imprimir no console, deve aparecer o seguinte resultado:
		Soma da linha 0: 9
		Soma da linha 1: 6
		Soma da linha 2: 3*/
public class Item25 {
public static void main(String[] args) {
	int[][][] matriz = new int[3][3][3];
	matriz[0][0][0]=3;
	matriz[1][1][1]=2;
	matriz[2][2][2]=1;
	int linha1=0;
	int linha2=0;
	int linha3=0;
	for(int aux=0;aux<matriz.length;aux++){
		if(matriz[aux][aux][aux]==matriz[0][0][0]){
			linha1 =(matriz[0][0][0])+(matriz[0][0][0])+(matriz[0][0][0]);
		}else{
			if(matriz[aux][aux][aux]==matriz[1][1][1]){
				linha2 = (matriz[1][1][1])+(matriz[1][1][1])+(matriz[1][1][1]);
			}else{
				if(matriz[aux][aux][aux]==matriz[2][2][2]){
					linha3 = (matriz[2][2][2])+(matriz[2][2][2])+(matriz[2][2][2]);
				}
			}
		}
	}
	System.out.println("Soma da linha 1= "+linha1+"\nSoma da linha 2= "+linha2+
			"\nSoma da linha 3= "+linha3);
}
}
