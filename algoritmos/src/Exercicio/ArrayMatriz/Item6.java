package Exercicio.ArrayMatriz;
/*6. Criar um array do tipo int, com valores de 0 à 5.
a. Imprimir todos os valores do array
b. Imprimir todos os valores do array de forma decrescente*/
public class Item6 {
	
	public static void main(String[] args) {
		int[] num = new int[6];
		num[0]=0;
		num[1]=1;
		num[2]=2;
		num[3]=3;
		num[4]=4;
		num[5]=5;
	
		for (int i=0;i<6;i++){
		     num[i]=i;  
			System.out.println(num[i]);}
	    for(int j=5;j>=0;j--){
	    	num[j]=j;
	    	System.out.println(num[j]);
	    }
	}}

