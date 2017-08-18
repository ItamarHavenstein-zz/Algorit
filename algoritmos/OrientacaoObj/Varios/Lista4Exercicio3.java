package Varios;

abstract class Lista4Exercicio3 {
	//foram criados os atributos como private e não foi criado os get e set,
	//dos atributos e por esse motivo so irão funcionar dentro desta classe 
	//se caso nos quisermos buscar esses atributos a partir de outra classe
	//não consiguiremos .
	
 private String nome;
 private long capacidadeEmBytes;
 
 Lista4Exercicio3(String n,long c){
	 nome = n; capacidadeEmBytes = c;
 }
 
 abstract public String toString();
 abstract public double capacidadeEmMegaBytes();
 
}

