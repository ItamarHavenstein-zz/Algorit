package exercicios.CondeInter;
/*25. Do texto abaixo, extraia apenas o nome da rua, utilizando indexOf e substring
a. Rua Antônio da Veiga, número 201, Vila Nova, Blumenau - SC
b. SC - Blumenau, rua Joiville nº 2011.*/

public class Item23 {
	
	public static void main(String[] args) {
		String endereco = "Rua Antônio da Veiga, número 201, Vila Nova, Blumenau - SC.";
		String endereco_1 = "SC - Blumenau, rua Joinville nº 2011.";
		int pos = endereco.indexOf(" ");
		int pos1 = endereco.indexOf(",");
		String rua = endereco.substring(pos,pos1);
		System.out.println("Nome da rua é: "+rua);
		int pos2 = endereco_1.indexOf("J");
		int pos3 = endereco_1.indexOf("nº");
		String rua1 = endereco_1.substring(pos2,pos3);
		System.out.println("Nome da rua é: "+rua1);
	}
}
