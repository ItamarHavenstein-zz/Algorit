package Exercicio.ArrayMatriz;
/*9. Criar um array do tipo int de 6 posições.
 *  Criar um for para popular o array com os valores 0, 1, 2, 3, 4, 5.*/
public class Item9 {
public static void main(String[] args) {
	int[] num = new int[6];
	num[0]=0;
	num[1]=0;
	num[2]=0;
	num[3]=0;
	num[4]=0;
	num[5]=0;
	
	for(int a=0;a <num.length;a++){
				num[a] = a;
	System.out.println(num[a]);
	}
	System.out.println();
	System.out.println(num[3]);
	}
}
