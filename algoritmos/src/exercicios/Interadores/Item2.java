package exercicios.Interadores;
/*2. Utilizando for, imprimir no console um abaixo do outro, valores de 5 a 100, somente valores múltiplos de 5.*/
public class Item2 {
public static void main(String[] args) {
	System.out.println("Numeros multiplos de 5\n");
	for(int aux = 5; aux<=100;aux++){
		if(aux%5==0){
			System.out.println(aux);
		}
	}
}
}
