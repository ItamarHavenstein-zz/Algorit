package exercicios.CondeInter;
/*28. Converta o exercício anterior utilzando a função String.format ensinada (
String primeiroNome = "Vinícius";
String templateTexto = "Meu nome é %1$s. E de novo meu nome é %1$s";
		System.out.println(String.format(templateTexto, primeiroNome));*/

public class Item26 {

	public static void main(String[] args) {
		String nome1 = "Itamar";
		String texto = "Meu nome é %1$s. E de novo meu nome é %1$s.";
		System.out.println(String.format(texto,nome1));		
	}
}
