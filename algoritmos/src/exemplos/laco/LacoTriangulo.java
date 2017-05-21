package exemplos.laco;

public class LacoTriangulo {
//System.out.print - imprime na tela e o cursor fica logo apos o ultimo caracter impresso
//System.out.println - imprime na tela e da uma quebra de linha e o cursosr fica na proxima linha
//System.out.printf - imprime na tela seguindo uma formatação ditada por uma string

	public static void main(String[] args) {
		
		 for(int i = 1; i < 5; i++) {
			 for(int j = 0; j < i; j++) { 
				 System.out.print("1"); }
			 System.out.println(); }
	}
}
