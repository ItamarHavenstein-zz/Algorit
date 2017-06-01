package Exercicio.ArrayMatriz;
/*18. Criar um array de 10 posições, e popular este array apenas com múltiplos de 10,
 *  ou seja, na posição 0 deverá ter o valor 10, na posição 1 o valor 20, e assim por diante.*/
public class Item18 {
public static void main(String[] args) {
	int[] mult10 = new int[10];
	int b =0;
	for(int a = 1; a<=100;a++){
		if((a%10==0)&&(mult10[b]==0)){
			mult10[b]=a;
			b++;
		}
	}
	System.out.println("Array com multiplos de 10\n");
	for(int c = 0;c<mult10.length;c++){
		System.out.println(mult10[c]);
	}
}
}
