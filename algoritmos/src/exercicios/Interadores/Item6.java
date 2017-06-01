package exercicios.Interadores;
/*6. Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 100,
 *  somente valores múltiplos de 5 ou 10.*/
public class Item6 {
public static void main(String[] args) {
	System.out.println("Lista 10 a 100, Imprimindo multiplos de 5 ou 10\n");
	for(int aux=10;aux<=100;aux++){
		if((aux%5==0)||(aux%10==0)){
			System.out.println(aux);
		}
	}
}
}
