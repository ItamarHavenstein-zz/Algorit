package Agenda;

public class ContatoEmail extends ContatoTelefone {

	public ContatoEmail(String nome, String email) {
		super(nome, email, "E-mail");
		
	}

	@Override
	public String ListaContatos() {
		String contato = "";
		contato += "\n E-mail";
		contato += "\n Nome: "+super.getNome();
		contato += "\n E-mail: "+super.getContato();
		return contato;
	}

}
