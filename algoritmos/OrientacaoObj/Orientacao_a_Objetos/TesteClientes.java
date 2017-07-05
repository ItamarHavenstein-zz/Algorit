package Orientacao_a_Objetos;


public class TesteClientes {
	public static void main(String[] args)  {
		
		ClientesBanco cliente1 = new ClientesBanco ();
		cliente1.nomeClientes ="Joao";
		cliente1.codigoClientes = 1;
		System.out.println("o cliente "+cliente1.nomeClientes+" com o codigo "
		+cliente1.codigoClientes);
		
		ClientesBanco cliente2 = new ClientesBanco ();
		cliente2.nomeClientes ="Pedro";
		cliente2.codigoClientes = 2;
		System.out.println("o cliente "+cliente2.nomeClientes+" com o codigo "
				+cliente2.codigoClientes);
		
		
		}	
}
