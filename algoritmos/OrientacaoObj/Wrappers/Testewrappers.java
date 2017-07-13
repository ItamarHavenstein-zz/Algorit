package Wrappers;

import java.util.HashMap;

public class Testewrappers {

	public static void main(String[] args) {
		// int z= Integer.parseInt("dois");
		// System.out.println(z);
		/*
		 * codigo compila sem problemas mais uma excecao vai acontecer nao há
		 * nada de errado na sintaxe porem a jvm nao consegue converter uma
		 * string literal em um numero inteiro
		 */

		// String - primitivo
		double d = Double.parseDouble("10");
		System.out.println(d);

		// Long l = new Long(8);
		// int lh = l.longValue();
		/*
		 * nao compila o to tentando colocar um long dentro de um int nao é
		 * valido isso
		 */

		// String --> OBJETOS
		Float f = Float.valueOf("10");
		System.out.println(f);
		Integer i = new Integer(10);
		// Objeto --> Primitivo
		int g = i.intValue();

		Integer a = new Integer(10);
		Integer h = new Integer(10);
		System.out.println(a == h);// false
		/*
		 * aqui dois objetos diferentes porem com mesmo valor == testa a
		 * referencia e nao valores dos objetos
		 */

		// criando meus wrappers
		Integer soma = new Integer(10);
		System.out.println(soma);

		// criando uma lista sem o autoboxing
		HashMap hashMap = new HashMap();

		hashMap.put(new Integer(10), "Carlos");
		hashMap.put(new Integer(11), "Jose");
		hashMap.put(new Integer(12), "Pedro");

		// fazendo um sysou mostra para mim entre colchetes todos os valores que
		// eu coloquei no hashMap
		System.out.println(hashMap);

		// com autoboxing
		HashMap hashMap1 = new HashMap();
		hashMap1.put(10, "Carlos");
		hashMap1.put(11, "Jose");
		hashMap1.put(12, "Pedro");

		// mesmo resultado que o anterior
		System.out.println(hashMap1);

		// boxing conversion
		Boolean meuBoolean = true;
		System.out.println(meuBoolean);

		// a conversão é feita de forma automática para o boolean
		Integer meuInteger = 1203;
		Double meuDouble = 10.20;
		System.out.println(meuInteger + " " + meuDouble);

		// unboxing conversion
		boolean e = new Boolean("True");
		char c = new Character('c');
		byte b = new Byte("1");
		float j = new Float(1.0f);

		System.out.println(e + " " + c + " " + b + " " + j);

		// neste ponto qundo quisermos comparar duas Strings precisamos utilizar
		// o comando equals()
		Integer t = 200;
		Integer p = 200;
		System.out.println(t.equals(p)); // Retorna TRUE
		System.out.println(t == p); // Retorna FALSE
		/*
		 * Porque então o exemplo da Listagem 8 retorna TRUE? Por causa do
		 * padrão de projeto Flyweigth. Ele tenta reduzir o consumo de memória
		 * mudando a referência dos objetos que são idênticos, ou seja, os
		 * objetos x e y apontam para um mesmo objeto com que tem as
		 * características ditando que o valor é 120, assim quando compararmos
		 * com ==, já que estamos comparando a referência do objeto e ela é a
		 * mesma com o Flyweigth o resultado será TRUE. Isso por padrão só é
		 * aplicado nos valores de -128 até 127, mas na dúvida use sempre o
		 * equals.
		 */
		Integer x = 120;
		Integer y = 120;
		System.out.println(x == y); // Retorna TRUE

		// criando um wrapper e inserindo um valor, abrindo incrementando e
		// fechando novamente e depois exibindo o valor
		Integer u = new Integer(45);
		u++;
		System.out.println("u = " + u);

		String numInt = "9822";

		// Representação em String do tipo que está sendo criado
		Float fNum1 = new Float("500.50");
		Integer iNum1 = new Integer(numInt);
		Double dNum1 = new Double("512.22");

		// o argumento somente aceita do tipo char, por isso que é usado aspas
		// simples
		Character cNum = new Character('a');

		// Criação do tipo primitivo natural
		Float fNum2 = new Float(500.50);
		Integer iNum2 = new Integer(2800);
		Double dNum2 = new Double(512.22);

		System.out.println("Float representadopor string: " + fNum1);
		System.out.println("Float natural: " + fNum2);
		System.out.println("Integer representado por string: " + iNum1);
		System.out.println("Char: " + cNum);
		
		
		
		//vamos saber qual será a resposta correta
		boolean flag1 = true;
		boolean flag2 = false;
        String flag3 = "true";
		
		Boolean b1 = new Boolean("truE");
		Boolean b2 = new Boolean("TRUE");
		Boolean b3 = new Boolean("TuE");
		Boolean b4 = new Boolean(flag3);
		
		if(b1){
		System.out.println("B1 é verdadeiro!");
		}

		if(flag1 == b2){
		System.out.println("flag1 == b2: Igual");
		}else{
		System.out.println("flag1 == b2: Diferente");
		}

		System.out.println(flag1 == b1 ? "flag1 == b1: Igual" : "flag1 == b1: Diferente");
		System.out.println(flag1 == b3 ? "flag1 == b3: Igual" : "flag1 == b3: Diferente");
		System.out.println(flag1 == b4 ? "flag1 == b4: Igual" : "flag1 == b4: Diferente");
		
		Boolean b5 = new Boolean("false");
		Boolean b6 = new Boolean("faLse");
		Boolean b7 = new Boolean("FALSE");
		Boolean b8 = new Boolean("flse");
		
		System.out.println(flag2 == b5 ? "flag2 == b5: Igual" : "flag2 == b5: Diferente");
		System.out.println(flag2 == b6 ? "flag2 == b6: Igual" : "flag2 == b6: Diferente");
		System.out.println(flag2 == b7 ? "flag2 == b7: Igual" : "flag2 == b7: Diferente");
		System.out.println(flag2 == b8 ? "flag2 == b8: Diferente" : "flag2 == b8: Igual" );


		//CONVERSSÃO DE WARPPERS PARA TIPOS PRIMITIVOS
		//cria um objeto wrapper
		Integer velocidade = new Integer(587);
		
		//converte a variável velocidade para tipo primitivo
		double total = velocidade.doubleValue();
		short total1 = velocidade.shortValue();
		byte total2 = velocidade.byteValue();
		
		Float pi = new Float(3.14f);
		int valorPi = pi.intValue();
		
		System.out.println("Valor de PI arredondado: "+valorPi);
		System.out.println("Total: "+total);
		//CONVERSÃO USANDO PARSE
		double soma4 = Double.parseDouble("685.65");
		System.out.println("Soma: "+soma);
		//CONVERSÃO UTILIZANDO METODO VALUEOF() COM A CLASSE STRING
		Integer idade = new Integer(39);
		String idadeString = String.valueOf(idade);
		String velocidade2 = new String("568.55");
		Double velocidadeDouble = Double.valueOf(velocidade);
		
		System.out.println("Idade string: "+idadeString);
		System.out.println("Velocidade double: "+velocidadeDouble);
		//Exemplo da sobrescrição do método toString().
		/*Classe Testadora
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria);
		cliente.setEndereco("Av. dos Mares, 321");
	
		System.out.println(cliente.toString());
		
		Classe Cliente
		@Override
		public String toString() {
		return "Nome: "+getNome() + "\nEndereço: "+getEndereco();*/



		
		

	}
}
