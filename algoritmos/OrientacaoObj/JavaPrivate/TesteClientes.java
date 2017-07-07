package JavaPrivate;

public class TesteClientes {
	public static void main(String[] args) {
		// criando um novo cliente
		ClientesBanco cliente1 = new ClientesBanco();
		cliente1.setNomeClientes("João");
		cliente1.setCodigoClientes(1);
		//imprime os dados do cliente criado
		System.out.println("o cliente " + cliente1.getNomeClientes() + " com o codigo " + 
					cliente1.getCodigoClientes());

		// criando novo cliente
		ClientesBanco cliente2 = new ClientesBanco();
		cliente2.setNomeClientes("Pedro");
		cliente2.setCodigoClientes(2);
		//imprime os dados dos clientes criados
		System.out.println("o cliente " + cliente2.getNomeClientes() + " com o codigo " + 
					cliente2.getCodigoClientes());

	}
}
