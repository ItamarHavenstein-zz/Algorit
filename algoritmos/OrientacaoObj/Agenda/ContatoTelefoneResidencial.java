package Agenda;

public class ContatoTelefoneResidencial extends ContatoTelefone{

	public ContatoTelefoneResidencial(String nome, String contato) {
		super(nome, contato, "Telefone Residencial");
		
	}

	@Override
	public String ListaContatos() {
		String contato = "";
		contato += "\nTelefone Residencial";
		contato += "\n Nome: "+super.getNome();
		contato += "\n Numero: "+super.getContato();
		return contato;
	}

	

	
}
