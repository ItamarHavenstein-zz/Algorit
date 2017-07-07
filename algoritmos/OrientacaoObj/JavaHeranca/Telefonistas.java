package JavaHeranca;

public class Telefonistas extends Funcionarios {

	private String estacaoTrabalho;

	public String getEstacaoTrabalho() {
		return estacaoTrabalho;
	}

	public void setEstacaoTrabalho(String estacaoTrabalho) {
		this.estacaoTrabalho = estacaoTrabalho;
	}

	@Override
	public String info() {
		return super.info() + "\nEstação de trabalho: " + estacaoTrabalho;
	}
}
