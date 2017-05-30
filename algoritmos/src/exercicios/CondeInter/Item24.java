package exercicios.CondeInter;
/*26. Da data em texto “25/05/2015”, extraia o dia, mês e ano e imprima a
 *  data da seguinte forma (O dia é {dia}, do mês {mês}, do ano {ano}).*/

import java.util.Scanner;

public class Item24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma data(dd/mm/aaaa)");
		String data = scanner.nextLine();
		int diaini = data.indexOf("");
		int diafim = data.indexOf("/");
		String dia = data.substring(diaini,diafim);
		int mesini = data.indexOf("/");
		mesini++;
		int mesfim = data.lastIndexOf("/");
		String mes =data.substring(mesini, mesfim);
		int anoini = data.lastIndexOf("/");
		anoini++;
		int anofim = data.lastIndexOf("");
		String ano = data.substring(anoini,anofim);
		System.out.println(" O dia é "+dia+", do mês "+mes+", do ano "+ano);
		scanner.close();
	}
}
