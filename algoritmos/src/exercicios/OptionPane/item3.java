package exercicios.OptionPane;
//3) Imprima no console uma lista de 20 a 100, e no lugar do número 25 imprima “Olá”;

import javax.swing.JOptionPane;

public class item3 {// (\n) para fazer uma quebra de linha dentro da caixa de dialogo
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "20 21 22 23 24 olá\n26 27 28 29 30\n31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50 51\n"
				+ "52 53 54 55 56 57 58 59 60\n61 62 63 64 65 66 67 68 69 70\n71 72 73 74 75 76 77 78 79 80 81\n"
				+"82 83 84 85 86 87 88 89 90 91 92 93\n94 95 96 97 98 99 100");
	}
}
