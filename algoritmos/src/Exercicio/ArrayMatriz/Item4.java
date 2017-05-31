package Exercicio.ArrayMatriz;
/*4. Criar um array do tipo int, colocando os seguintes valores no array 10, 9, 8, 7.
a. Imprimir o tamanho deste array*/
public class Item4 {
	
	public static void main(String[] args) {
		int[] numero = new int[4];
		numero[0]=10;
		numero[1]=9;
		numero[2]=8;
		numero[3]=7;
		int a1=0;
		for(int a =0 ; a<= numero.length;a++)
		a1++;
		System.out.println("Existe "+a1+" posições");
		
		  
	}
}
