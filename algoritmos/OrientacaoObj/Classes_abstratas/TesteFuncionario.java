package Classes_abstratas;

public class TesteFuncionario {

	public static void main(String[] args) {
		//introduz as informações nas variaveis
		Gerente g = new Gerente("Everton da Silva", 1,"everton", 1500.0d, 15d);
		Atendente a = new Atendente("Patricia Souza", 2,"150",956.25d, 10d);
		
		//imprime as informações na tela sobre os funcionarios
		g.informacoes();
		System.out.println();
		a.informacoes();
		// acrecentado a bonifocação de 15%
		g.bonificacao();
		System.out.println();
		//imprime novamente as informações para ver se a bonificação foi adicionada
		g.informacoes();
		a.bonificacao();
		System.out.println();
		a.informacoes();
	}
}
