package Enum;

/*para fazermos uma enum no caso aqui é para fazer um menu para que nosso usuario informe para o programa o que ele deseja fazer
 * ao inves de estar escrito (public class Exemplo) colocamos no lugar (public enum Exemplo).*/
public enum Exemplo {

    SALVAR(1), IMPRMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
	
	private final int valor;
	Exemplo(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}

}
