package Exercicio.ArrayMatriz;
/*13. Criar um array de 10 posições, e popular o array com os valores 1, 2, 3, 4, 5 a
 *  partir da posição 4 utilizando for. Para colocar os valores 
 *  1, 2, 3, 4, 5 utilizando uma variável. */
public class Item13 {
public static void main(String[] args) {
	int[] num = new int[10];
	for(int a =0;a<num.length;a++){
		if(a<5){
			num[a]= a;
		}else{
			a=0;
		}
	System.out.println(num[a]);}
}
}
