package Meu;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//criar uma arraylist
		ArrayList<String> projeto = new ArrayList<String>();
		
		//inserindo valores no array
		projeto.add("peças 1");
		projeto.add("peças 2");
		projeto.add("peças 3");
		
		
		
		//mostrando os "n" contatos da agenda (usando o índice)
	    // número de elementos da agenda: método size()
		int n = projeto.size();
		System.out.println("Quantidade de projetos e tipos:");
		for(int i=0;i<n;i++){
		System.out.println("N°:"+i+"-"+projeto.get(i));
		}
		
		
		scanner.close();
	}
}
