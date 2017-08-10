package Agenda;

public class ContatoTelefoneCelular extends ContatoTelefone{

	public ContatoTelefoneCelular(String nome, String contato) {
		super(nome, contato, "Telefone Celular");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ListaContatos() {
		String contato = "";
		contato += "\n Telefone Celular";
		contato += "\n Nome: "+super.getNome();
		contato += "\n Numero: "+super.getContato();
		return contato;
	}

	

}
