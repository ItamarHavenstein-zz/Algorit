package Exercicio.ArrayMatriz;
/*15. Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inserção. 
 * Criar um outro array de mesmo tamanho. Utilizando for, pegar todos os valores presentes no 
 * primeiro array e inserir no segundo array de forma decrescente (2, 4, 6, 8, 10). 
 * Desta forma os dois arrays terão os mesmo valores só que nas posições inversas. 
 * Imprimir o segundo array para verificar se o algoritmo funcionou.*/
public class Item15 {
public static void main(String[] args) {
	int[] mult = new int[5];
	int[] contr = new int[5];
	System.out.println("primeiro Array\n");
	for(int a =0;a<mult.length;a++){
		if(a==0){
			mult[0]=10;
		}else{
			if(a==1){
				mult[1]=8;
			}else{
				if(a==2){
					mult[2]=6;
				}else{
					if(a==3){
						mult[3]=4;
					}else{
						if(a==4){
							mult[4]=2;
						}
					}
				}
			}
		}
		System.out.println(mult[a]);
	}
	System.out.println("Segundo Array\n");
	for(int b = 0; b<contr.length;b++){
		if(b==0){
			contr[0]=mult[4];
		}else{
			if(b==1){
				contr[1]=mult[3];
			}else{
				if(b==2){
					contr[2]=mult[2];
				}else{
					if(b==3){
						contr[3]=mult[1];
					}else{
						if(b==4){
							contr[4]=mult[0];
						}
					}
				}
			}
		}
		System.out.println(contr[b]);
	}
	
	}
	
	
}
