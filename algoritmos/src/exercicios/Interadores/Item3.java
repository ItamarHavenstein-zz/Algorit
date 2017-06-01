package exercicios.Interadores;
/*3. Utilizando for, imprimir no console um abaixo do outro, valores de -10 a 10, somente valores positivos.*/
public class Item3 {
public static void main(String[] args) {
	System.out.println("Somente numeros positivos\n");
	for(int aux = -10; aux<=10;aux++){
		if(aux>0){
		System.out.println(aux);
		}
	}
}
}
