package Exercicio.ArrayMatriz;
/*22. Crie um array de 5 posições com os valores 1, 3, 5, 7, 9. Peça para o usuário digitar um valor.
 *  Se o valor digitado pelo usuário estiver no array, imprima “Achei o valor”, caso contrário,
 *   não achei o valor. (o System.out.println deve estar fora do for)..*/
import java.util.Scanner;
public class Item22 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] procura = new int[5];
	procura[0]= 1;
	procura[1]= 3;
	procura[2]= 5;
	procura[3]= 7;
	procura[4]= 9;
	String existe = null;
	System.out.println("Digite um numero");
	int compara = scanner.nextInt();
	for(int a = 0;a<procura.length;a++){
		if(compara == procura[a]){
			existe = "Achei o valor"; 
			break;
		}else{
			existe ="Não achei o valor";
		}
	}
	System.out.println(existe);
	
	scanner.close();
}
}
