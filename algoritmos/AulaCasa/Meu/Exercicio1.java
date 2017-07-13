package Meu;
//Imprima todos os n�meros de 150 a 300
public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("Imprimir valores entre 150 e 300\n");
		for(int aux = 0;aux<=300;aux++){
			if(aux>149 && aux<301){
				System.out.println(aux);
			}
		}
	}
}
