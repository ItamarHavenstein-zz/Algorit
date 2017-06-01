package Exercicio.ArrayMatriz;
/*16. Criar um array com 10 posições. Inserir nas posições 2, 4, 5, 7 os respectivos valores “A”, “B”, “C”, “D”.
 *  Com for ou while, inserir a letra “W” nas posições do array no qual não tem valor 
 *  (verificar a posição do array com null para validar se possui valor ou não na posição do array, 
 *  array[i] == null). Imprimir o array para verificar se o algoritmo funcionou. Fazer o 
 *  exercício utilizando for ou while.*/
public class Item16 {
public static void main(String[] args) {
	char[] caract = new char[10];
	caract[0]= '2';
	caract[1]='4';
	caract[2]='5';
	caract[3]='7';
    caract[5]='A';
	caract[6]='B';
	caract[7]='C';
	caract[9]='D';
	for(int  a = 0; a<caract.length;a++)
	System.out.println(caract[a]);
	for(int a =0;a<caract.length;a++){
		if(caract[a] == 0){
			caract[a]= 'W';
		}
		}
	System.out.println("Segunda lista\n");
	for(int a =0;a<caract.length;a++)
	System.out.println(caract[a]);
}
}
