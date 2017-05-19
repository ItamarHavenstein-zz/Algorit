package exercicios.OptionPane;
//14) Imprima somente números que são múltiplos de 100, de -100 à 100;

//import javax.swing.JOptionPane;

public class item14 {
	
	public static void main(String[] args) {
		for(int a = -100; a <=100; a++){
			if(a %100 == 0){
				System.out.println("multiplos de 100: " +a);
			}
		}
	}
}
