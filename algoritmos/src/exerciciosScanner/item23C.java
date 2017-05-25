package exerciciosScanner;
/*c. int numero = 10;
		int outroNumero = numero;
		outroNumero = outroNumero + 10;
		numero = outroNumero;
		numero = outroNumero + 1;
		System.out.println(numero + 1);
		outroNumero = numero + 1;
		System.out.println(numero);

		Console:
21		
22
		*/


public class item23C {/*não esta condizente,coloquei na ordem que aparece os numeros apos da execução */

	public static void main(String[] args) {
		int numero = 10;
		int outroNumero = numero;
			outroNumero = outroNumero + 10;
			//outroNumero =20
			numero = outroNumero;
			//numero = 20
			numero = outroNumero + 1;
			//numero = 21
				System.out.println(numero + 1);
				//imprime numero = 22
			outroNumero = numero + 1;
			//outroNumero = 21
				System.out.println(numero);
				//imprime numero = 21

	}
}
