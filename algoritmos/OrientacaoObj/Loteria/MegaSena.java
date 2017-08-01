package Loteria;

import java.awt.List;
import java.util.ArrayList;

public class MegaSena {
	public static void main(String[] args) {
		//apostas que forram feitas
		int[] aposta1 = new int[] {2, 9, 10, 11, 25, 59};
		int[] aposta2 = new int[] {2, 9, 10, 5, 14, 59};
		int[] aposta3 = new int[] {12, 15, 30, 38, 39, 40};
		int[] aposta4 = new int[] {3, 5, 6, 10, 11, 12};
		int[] aposta5 = new int[] {2, 4, 8, 26, 35, 38};
		
		// o resultado do sorteio realizado
		int[] resultado = new int[] {59, 25, 11, 9, 10, 2};
		
		int acertos = 0;
				
		for(int aux = 0; aux < 6;aux++){
			for(int aux1 =0;aux1<6;aux1++){
				if(resultado[aux] == aposta1[aux1]){
					acertos += 1;
				}		
			}		
		}		
		if(acertos == 6){
			System.out.println("Ganhou a mega sena");
		
		}else if(acertos == 5){
			System.out.println("Ganhou a quina");
		
		}else if(acertos == 4){
			System.out.println("Ganhou a quadra");
			
		}else{
			System.out.println("Tente novamente");
			
		}
	}
}
