package Exercicio.ArrayMatriz;
/*7. Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
a. Imprimir todos os valores do array 
b. Imprimir todos os valores do array de forma contrário, ou seja, “F”, “E”, “D”, “C”, “B”, “A”
c. Imprimir todos os valores do array menos que tenha o valor “C”*/
public class Item7 {

	public static void main(String[] args) {
		String[] letras = new String[6];
		letras[0]="A";
		letras[1]="B";
		letras[2]="C";
		letras[3]="D";
		letras[4]="E";
		letras[5]="F";
		for (int i=0;i<6;i++){		   
			System.out.println("a)= "+letras[i]);}
		System.out.println();
	    for(int j=5;j>=0;j--){	    	
	    	System.out.println("b)= "+letras[j]);}
	    System.out.println();
	    for(int j=5;j>=0;j--)
	    if(letras[j] != letras[2]){
	    	System.out.println("c)= "+letras[j]);
	    }
	    
}}

