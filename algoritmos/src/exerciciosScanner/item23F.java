package exerciciosScanner;
/*f. boolean numero = true;
	String booleano = “false”;
	numero = false | true;
booleano = “false | false”;
numero = false | numero;
System.out.println(booleano );
System.out.println(numero );

Console:
false
true*/


public class item23F {

	public static void main(String[] args) {/*não está condizente, pois a variavel booleano é uma string então 
	irá imprimir o que for escrita nela e não fará nenhuma lógica, e na variavel numero ela é uma boolean então
	fará a operação lógica no programa então a resposta ficará: (booleano:false | false) e (numero:true)*/
	boolean numero = true;
	String booleano = "false";
		numero = false | true;
		booleano = "false | false";
		numero = false | numero;
			System.out.println(booleano );
			System.out.println(numero );
	}
}
