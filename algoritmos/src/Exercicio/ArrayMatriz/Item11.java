package Exercicio.ArrayMatriz;
/*11. Criar um array do tipo boolean de 6 posições. Utilizando um for, popular o array aonde 
 * as posições forem pares colocar o valor true, e nas posições ímpares o valor false.*/
public class Item11 {
	public static void main(String[] args) {
		boolean[] tf = new boolean[6];
		
		for(int a= 0;a<tf.length;a++){
			if(a%2==0){
				tf[a]= true;
			}else{
				tf[a]=false;
			}
		System.out.println(tf[a]);
		}
	}
}

