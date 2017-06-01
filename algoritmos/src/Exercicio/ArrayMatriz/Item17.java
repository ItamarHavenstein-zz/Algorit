package Exercicio.ArrayMatriz;
/*17. Criar um array com 10 posições, com valores de 1 a 10 sequenciais. Criar um array de 5 posições.
 *  Popular o segundo array somente com os valores ímpares do primeiro array utilizando for. 
 *  Imprimir o segundo array para verificar se o algoritmo funcionou.*/
public class Item17 {
public static void main(String[] args) {
	int [] primeiro = new int[10];
	int [] segundo = new int[5];
	System.out.println("Primeiro Array\n");
	for(int a = 0;a<primeiro.length;a++){
		if(a <10){
			primeiro[a]= a+1;
		}
		System.out.println(primeiro[a]);
	}
	int c =0;
	for(int b=0;b<primeiro.length;b++){
		if((b%2==1)&&(segundo[c] == 0)){
			segundo[c]= b;
			c++;
		}
	}
	System.out.println("\nSegundo Array\n");
	for(int d =0;d<segundo.length;d++){
		System.out.println(segundo[d]);
	}
	}
}
