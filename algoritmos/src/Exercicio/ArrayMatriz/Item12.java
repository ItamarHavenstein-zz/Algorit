package Exercicio.ArrayMatriz;
/*12. Criar um array do tipo boolean com 3 posições, com os valores true, false, true. Utilizando for, 
 * verifique se comparado todos os valores boleanos do array com o operador ou (|) é verdadeiro, 
 * caso sim imprima “1”, caso contrário “2”.*/
public class Item12 {
public static void main(String[] args) {
	boolean[] tf = new boolean[3];
	tf[0]=true;
	tf[1]=false;
	tf[2]=true;
	int b = 0;
	for(int a = 0; a <tf.length;a++){
		if(tf[a] | true){
			b++;
		}
	}
	if (b ==3){
		System.out.println("1");
	}else {
		System.out.println("2");
	}
}
}
