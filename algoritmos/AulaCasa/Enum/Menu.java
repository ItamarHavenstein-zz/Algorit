package Enum;

public enum Menu {
//coloco os valores da minha lista enum, entre parenteses esta os valores de cada 'objeto' que tenho no meu programa
//poderia ser um atributo double tambem como no caso um preço de algo.
	PEDIDOS(1), CAIXA(2), HISTORICO(3), SAIR(0);
	
	//
	private final int valor;
	
	//criando um construtor 
	Menu(int valorOpcao){
		valor = valorOpcao;
	}
	
	public int getValor(){
		return valor;
	}

}
