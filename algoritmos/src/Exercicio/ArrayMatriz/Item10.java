package Exercicio.ArrayMatriz;
/*10. Criar um array do tipo int de 6 posições,
 *  com os valores 1, 3, 5, 7, 9, 11. Imprimir todas as posições menos a última posição 
 *  (verificar se é a última posições e não verificar se é o de valor 11).
*/
public class Item10 {
public static void main(String[] args) {
	int[] num = new int[6];
	num[0]=1;
	num[1]=3;
	num[2]=5;
	num[3]=7;
	num[4]=9;
	num[5]=11;
	for(int a =0;a<num.length;a++){
		if(a < 5){
			System.out.println(num[a]);
		}
	}
		
	
		
	
}
	
}

