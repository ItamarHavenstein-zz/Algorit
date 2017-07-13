package Meu;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercicioList2 {

	public static void main(String[] args) {
		ArrayList<String> bandas = new ArrayList<String>();
		
		//inserindo valor
		bandas.add("RUSH");
		bandas.add("BEATLES");
		bandas.add("IRON MAIDEN");
		
		//imprimindo valores do array, são mostrados um ao lado do outro e entre colchetes
		System.out.println(Arrays.toString(bandas.toArray()));
		
		//imprimi a mesma coisa mas sem os colchetes como no caso anterior,neste exemplo tambem é mostrado um abaixo do outro os valores do array
		int aux = bandas.size();
		for(int aux1 = 0; aux1<aux; aux1++){
		System.out.println(aux1+" "+bandas.get(aux1));
		}
		
		//vamos mudar um valor de um determinado array, utilizando o metodo add(posição do array, valor a ser inserido);
		//nos metodos que fizemos agora simplismente trocamos um determinado valor que estava na posição zero pelo valor que adicionamos,
		//mas o valor que estava na posição zero passou entao a ser da posição numero 1
		bandas.add(0, "TIRIRICA");
		//imprimindo agora vemos que na posição 0 que antes era rush temos o tiririca.
		System.out.println("na posição 0 agora é: "+bandas.get(0));
		
		//faz a mesma coisa que o comando anterior, mas aqui o valor do array precisa ser escrito corretamente, no caso como foi adicionado ao array
		bandas.add(bandas.indexOf("TIRIRICA"),"RUSH");
		System.out.println("na posição 0 agora é: "+bandas.get(0));
		
		//aqui imprimimos quantos valores temos no nosso array
		System.out.println(bandas.size());
		//imprimindo os valores que foram adicionados no array
		int aux2 = bandas.size();
		for(int aux1 = 0; aux1<aux2; aux1++){
		System.out.println(aux1+" "+bandas.get(aux1));
		}
		
		//removendo o nome tiririca da nossa lista
		bandas.remove("TIRIRICA");
		System.out.println(Arrays.toString(bandas.toArray()));
		
		//com este comando limpamos a nossa lista
		bandas.clear();
		System.out.println(Arrays.toString(bandas.toArray()));
		
	}
}
