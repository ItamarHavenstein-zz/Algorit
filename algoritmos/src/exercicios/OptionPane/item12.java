package exercicios.OptionPane;
//12) Imprima somente números múltiplos de 15 que são pares, de 0 à 1000;

//import javax.swing.JOptionPane;

public class item12 {

	public static void main(String[] args) {
		for (int a = 0; a <=1000; a++){
			if(a %15 == 0 & a %2 == 0){
				System.out.println("multiplo de 15 e par: " +a);
			}
				
		}
	}
}
