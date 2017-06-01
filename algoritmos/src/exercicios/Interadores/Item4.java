package exercicios.Interadores;
/*4. Utilizando for, imprimir no console um abaixo do outro, valores de 10 a -10, somente valores negativos. */
public class Item4 {
public static void main(String[] args) {
	System.out.println("Somente Numeros negativos\n");
	for(int aux =10; aux>=(-10);aux--){
		if(aux<0){
			System.out.println(aux);
		}
	}
}
}
