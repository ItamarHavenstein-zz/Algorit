package exerciciosScanner;
/*22. Crie uma variável de nome “teste” do tipo boolean com o valor true. 
Crie outra variável de nome “outroTeste” do tipo boolean com o valor false. 
Imprima os valores das duas variáveis. Coloque o valor da variável “teste” na variável “outroTeste”. 
Imprima novamente ambas as variáveis. Agora coloque o valor false na variável “teste”, 
e imprima ambas as variáveis novamente. Verifique o que aconteceu.*/


public class item22 {

	public static void main(String[] args) {
		boolean test = true;
		boolean outrotest = false;
		System.out.println(test+ " "+outrotest);
		outrotest = test;
		System.out.println(test+ " "+outrotest);
		test = false;
		System.out.println(test+ " "+outrotest);
		
		
	}
}
