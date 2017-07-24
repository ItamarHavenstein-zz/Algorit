package Classes_abstratas;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente contac = new ContaCorrente("Mario Do Nascimento","1235",12548.55d,200.00d,5.23d);
		ContaPoupanca contap = new ContaPoupanca("Marcos Palmeira", "7894",5000.00d,50.21d);
		
		System.out.println(contac.getNumeroConta());
		System.out.println("\n"+contap.getNumeroConta());
		
		/*caso a classe que definimos como contas está configurada como abstrata, o  software não deixa compilar pois estamos fazendo um
		uma coisa errada perrante o software
		Contas c = new Contas();
		c.setNumeroConta("9654");*/
		
		contac.imprimiExtratoDetalhado();
		System.out.println();
		contap.imprimiExtratoDetalhado();
	}
}
