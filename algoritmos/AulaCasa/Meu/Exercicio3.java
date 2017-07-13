package Meu;
//Imprima todos os múltiplos de 3, entre 1 e 100.
public class Exercicio3 {

	public static void main(String[] args) {
		System.out.println("Numeros multiplos de 3:");
		for(int aux = 1; aux <=100; aux++){
			if(aux%3 == 0){
				System.out.print(aux+",");
			}
		}
		// os dois são os mensmos mas este segundo fiz uma para que no ultimo numero não apareça a virgula. 
		System.out.println("\nNumeros multiplos de 3:");
		int num = 100;
		for(int aux =1; aux <= num; aux++){
			if(aux%3 == 0){
				if(aux<num-1){
					System.out.print(aux+",");
				}else{
					System.out.print(aux);
				}
			}
		}
	}
}
