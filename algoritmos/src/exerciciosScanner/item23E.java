package exerciciosScanner;
/*e. String numero = “A”;
	int texto = 1;
	numero = numero + numero;
	texto = texto;
	texto = 2;
	System.out.println(numero);
System.out.println(texto);

Console:
1
2*/

public class item23E {/*Não está condizente pois a resposta será (AA,2), numero está somamdo com numero então fica AA
no caso do texto é atribuido 2 ao texto então ele imprime 2 e texto recebe texto é um comando redundante pois não muda valor do texto*/

	public static void main(String[] args) {
		String numero = "A";
		int texto = 1;
			numero = numero + numero;
			//texto = texto;
			texto = 2;
				System.out.println(numero);
				System.out.println(texto);
	}
}
