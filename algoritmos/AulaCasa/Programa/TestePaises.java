package Programa;

import java.util.ArrayList;

public class TestePaises {

	public static void main(String[] args) {
		Paises pais = new Paises("Brasil","Brasilia",1235.32d);
		Paises pais1 = new Paises("Brasil","Brasilia",2564.33d);
		Paises pais2 = new Paises("Argentina","Buenos Aires",95487.54d);
		Paises pais3 = new Paises("Chile","Brasilia",1235.32d);
		Paises pais4 = new Paises("Brasil","Buenos Aires",21548.56d);
		
		ArrayList<String> fronteira = new ArrayList<String>();
		//cuidar na hora de criar pois precisa colocar tudo entre as aspas assim("uhibikjbkbi, kjbui") e não assim("juunu","iuhbu","iujui")este 
		//ultimo não funciona da erro.
		fronteira.add("Argentina, Uruguai e Bolivia");
		fronteira.add("Brasil, Uruguai, Chile, Bolivia, Paraguai");
		
		
		System.out.println(pais.equals(pais1));
		System.out.println(pais.equals(pais2));
		System.out.println(pais.equals(pais3));
		System.out.println(pais.equals(pais4));
		
		System.out.println("País: "+pais.getPais()+", Capital: "+pais.getCapital()+" e a extensão territórial é "+pais.getExtensao()+
				"Km faz fronteira com os paises "+fronteira.get(0));
		
	}
}
