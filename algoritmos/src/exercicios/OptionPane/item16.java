package exercicios.OptionPane;
//16) Imprima apenas números que se divididos por 5 o resultado seja maior que 3, de 10 à 1000;



public class item16 {
	
	public static void main(String[] args) {
		for(int a = 10;a <=1000;a++){
			if(a % 5 > 3){
				System.out.println("Numeros divididos por 5 que o resto � maior que 3: "+a);
			}
		}
	}
}
