package exerciciosScanner;
/*d. double numero = 0.1 + 0.2;
		numero = 0.1 + 0.2;
		double outroNumero = numero - 0.1;
		numero = outroNumero;
		outroNumero = numero - 1;
		System.out.println(numero);

		Console: 
		0.3*/

public class item23D {//não esta condizente, a resposta sera 0.2, 

	public static void main(String[] args) {
		double numero = 0.1 + 0.2;//0.3
			numero = 0.1 + 0.2;//0.3
		double outroNumero = numero - 0.1;//0.2
			numero = outroNumero;//0.2
			outroNumero = numero - 1;//-0.8
				System.out.println(numero);//0.2
	}
}
