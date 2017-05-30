package exercicios.CondeInter;
/*29. Utlizando o template abaixo, substitua os locais com “$$$” por valores que fazem sentido, 
 * utilizando variáveis. Após imprima o texto convertido com os valores.
a. “Olá, tudo bem? Meu nome é $$$, tenho $$$ anos de idade, e moro em $$$ desde de que eu nasci. 
Moro com o(s) meu(s) $$$, no bairro da $$$.”*/
public class Item27 {

	public static void main(String[] args) {
		String nome ="Itamar";
		int idade = 25;
		String cidade = "Blumenau";
		String quem = "pais";
		String bairro = "Salto do norte";
		
		System.out.println("Olá, tudo bem? Meu nome é "+nome+", tenho "+idade+" anos de idade,\n e moro em "+cidade+" desde de que eu nasci.\n"
				+ "Moro com o(s) meu(s)"+quem+", no bairro do "+bairro);
	}
}
