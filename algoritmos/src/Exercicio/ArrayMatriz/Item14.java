package Exercicio.ArrayMatriz;



/*14. Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inserção. 
 * Criar um outro array de mesmo tamanho. Utilizando for, pegar todos os valores presentes 
 * no primeiro array e inserir no segundo array. Desta forma os dois arrays terão os mesmo 
 * valores nas mesmas posições. Imprimir o segundo array para verificar se o algoritmo funcionou.*/
public class Item14 {
public static void main(String[] args) {
	int[] num = new int[5];
	num[0]=10;
	num[1]=8;
	num[2]=6;
	num[3]=4;
	num[4]=2;
	int[] num1 = new int[5];
	 
	for(int a =0;a<num.length;a++){
		if(a==0){
			num1[0]=num[0];
		}else{
			if(a==1){
				num1[1]=num[1];
			}else{
				if(a==2){
					num1[2]=num[2];
				}else{
					if(a==3){
						num1[3]=num[3];
					}else{
						if(a==4){
							num1[4]=num[4];
						}
					}
				}
			}
		}
	}
	for(int b=0;b<num1.length;b++)
	System.out.println(num1[b]);
	
}
}
