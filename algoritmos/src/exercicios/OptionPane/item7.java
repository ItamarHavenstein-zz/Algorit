package exercicios.OptionPane;
//7) Imprima apenas números pares de 0 à 100;

//import javax.swing.JOptionPane;

public class item7 {
	
	public static void main(String[] args) {
		for (int a = 0; a <= 100; a++){
			if(a  %2 == 0){
				//JOptionPane.showMessageDialog(null, " numero par " +a);
				System.out.println("numero par " +a);
			}
		}
	}
}