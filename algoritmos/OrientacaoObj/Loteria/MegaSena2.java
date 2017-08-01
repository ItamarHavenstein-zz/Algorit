package Loteria;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MegaSena2 {

	public static void main(String[] args) {
		List<Integer> aposta1 = Arrays.asList(2, 9, 10, 11, 25, 59);
		List<Integer> aposta2 = Arrays.asList(2, 9, 10, 5, 14, 59);
		List<Integer> aposta3 = Arrays.asList(12, 15, 30, 38, 39, 40);
		List<Integer> aposta4 = Arrays.asList(3, 5, 6, 10, 11, 12);
		List<Integer> aposta5 = Arrays.asList(2, 4, 8, 26, 35, 38);

		//O resultado da mega sena é o seguinte:
		List<Integer> resultado = Arrays.asList(59, 25, 11, 9, 10, 2);
		
		
		int acertos = 0;
		for(int aux = 0; aux<6; aux++){
			for(int aux1 = 0; aux1<6; aux1++){
				if(resultado ){
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
