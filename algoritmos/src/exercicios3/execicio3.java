package exercicios3;
/*1. Um cliente quer que vocês gerem um cardápio para eles. 
	O cardápio terá os seguintes itens: 
	
	Pizza de calabresa
	Pizza de 4 queijos
	Pizza de frango
	Pizza de lombinho
	Pizza de coração
	Pizza de carne
	Pizza de strogonoff de frango
	Pizza de strogonoff de carne
	Pizza de 5 queijos
	Pizza de banana split
	Pizza de sonho de valsa
	Pizza de prestígio
	Pizza de chocolate preto
	Pizza de chocolate branco 
	Pizza de coco
	
	Deverá ser perguntado para o cliente qual é o valor de cada item do cardápio e imprimir no final o cardápio por completo com todos os itens e seus respectivos valores.

	Agora simule um pedido ao um garçom. Ou seja, com os valores agora armazenados pergunte a um cliente o que ele deseja:

	Somente uma pizza será solicitada ao cliente:
	Ou seja, o programa irá perguntar para o cliente que pizza ele quer, e o sistema irá informar o valor da mesma.
	*/
import javax.swing.JOptionPane;
/*switch(mes){
case 1: System.out.println("Janeiro");
		break;*/

public class execicio3 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Faça sua Escolha\n1-Pizza de Calabresa\n2-Pizza de 4 Queijos\n"
				+ "3-Pizza de Frango\n4-Pizza de Lombinho\n5-Pizza de Coração\n"
				+ "6-Pizza de Carne\n7-Pizza de Strognoff de Frango\n8-Pizza de Strogonoff de Carne\n"
				+ "9-Pizza de 5 Queijos\n10-Pizza de Banana Split\n11-Pizza de Sonho de Valsa\n"
				+ "12-Pizza de Prestígio\n13-Pizza de Chocolate Preto\n14-Pizza de Chocolate Branco\n"
				+ "15-Pizza de Coco");
		int Num_pizza = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da pizza que deseja"));
			switch(Num_pizza){
				case 1: JOptionPane.showMessageDialog(null,"Pizza de Calabresa");
					break;
				case 2: JOptionPane.showMessageDialog(null,"Pizza de 4 Queijos");
					break;
				case 3: JOptionPane.showMessageDialog(null, "Pizza de Frango");
					break;
				case 4: JOptionPane.showMessageDialog(null, "Pizza de Lombinho");
					break;
				case 5: JOptionPane.showMessageDialog(null, "Pizza de Coração");
					break;
				case 6: JOptionPane.showMessageDialog(null, "Pizza de Carne");
					break;
				case 7: JOptionPane.showMessageDialog(null,"Pizza de Strgnoff de Frango");
					break;
				case 8: JOptionPane.showMessageDialog(null, "Pizza de Strognoff de Frango");
					break;
				case 9: JOptionPane.showMessageDialog(null,"Pizza de 5 Queijos");
					break;
				case 10: JOptionPane.showMessageDialog(null,"Pizza de Banana Split");
					break;
				case 11: JOptionPane.showMessageDialog(null, "Pizza de Sonho de Valse");
					break;
				case 12: JOptionPane.showMessageDialog(null, "Pizza de Prestígio");
					break;
				case 13: JOptionPane.showMessageDialog(null,"Pizza de Chocolate Preto");
					break;
				case 14: JOptionPane.showMessageDialog(null,"Pizza de Chocoloate Branco");
					break;
				case 15: JOptionPane.showMessageDialog(null,"Pizza de Coco");
					break;
				
			}
		
	}
}
