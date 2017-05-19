package exercicios.OptionPane;
//11) Imprima apenas números múltiplos de 97 de 0 à 1000;

//import javax.swing.JOptionPane;

public class item11 {
	
	public static void main(String[] args) {
		
	
		for(int a = 0; a <= 1000; a++){
			if(a % 97 == 0)
			System.out.println("numeros multiplos de 97: "+a);
		}
	}
}

