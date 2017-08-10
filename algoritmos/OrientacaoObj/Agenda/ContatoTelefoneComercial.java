package Agenda;

public class ContatoTelefoneComercial extends ContatoTelefone{

	public ContatoTelefoneComercial(String nome, String contato) {
		super(nome, contato, "Telefone Comercial");
		
	}

	@Override
	public String ListaContatos() {
		String contato = "";
		contato += "\n Telefone Comercial";
		contato += "\n Nome: "+super.getNome();
		contato += "\n Numero: "+super.getContato();
		return contato;
	}

	

}
