package exercicios.Interadores;
/*7. Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 20, 
 * somente valores múltiplos de 5 seguindo o exemplo da mensagem (Este número é múltiplo de 5: <número>)
 *  ou múltiplos de 10 seguindo o exemplo da mensagem (Este número é múltiplo de 10: <número>). 
 *  Alterar o <número> para o valor da variável do contador.*/
public class Item7 {
public static void main(String[] args) {
	for(int aux=10;aux<=20;aux++){
		if(aux%5==0){
			System.out.println("Este numero é múltiplo de 5: "+aux);}
		if(aux%10==0){
			System.out.println("Este numero é múltiplo de 10: "+aux);
			}
		}
	}
}

