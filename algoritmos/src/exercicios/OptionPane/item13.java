package exercicios.OptionPane;
//13) Imprima somente números divisíveis por 5, de 1000 à 0;

//import javax.swing.JOptionPane;

public class item13 {

	public static void main(String[] args) {
		for(int a = 1000; a >=0; a--){
			if(a %5 == 0){
				System.out.println("divisiveis por 5: " +a);
			}
		}
	}
}
