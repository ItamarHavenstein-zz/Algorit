package exercicios.Interadores;
/*5. Utilizando for, imprimir no console um abaixo do outro, valores de -50 a 50, somente valores de 40 a 60.*/
public class Item5 {
public static void main(String[] args) {
	System.out.println("Imprimindo somente numeros acima de 40\n");
	for(int aux = -50;aux<=50;aux++){
		if(aux>=40){
			System.out.println(aux);
		}
	}
}
}
