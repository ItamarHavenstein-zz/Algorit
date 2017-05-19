package exercicios.numero5;
/* g. double numero = 20.0;
if(false) { 
	numero  + 1.0;
		System.out.println(numero);
} else {
	numero  = numero  - 1.0;
	System.out.println(numero);
}*/

public class itemG {
	
	public static void main(String[] args) {/*se colocar falso no if sempre dará a segunda condição sen a primeira
	inutil, caso coloque verdadeiro no if sempre acontecerá a primeira condição sendo inutil a segunda condição. */
		double numero = 20.0d;
		if (true){
			numero = numero + 1.0;
				System.out.println(numero);
		} /*else {
			numero = numero - 1.0;
			System.out.println(numero);
		}*/
	}
}
