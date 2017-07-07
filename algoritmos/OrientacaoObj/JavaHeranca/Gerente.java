package JavaHeranca;

public class Gerente extends Funcionarios {

	private String usuario;
	private String senha;
	public static double bonus = 20;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	// aumento para o gerente
	@Override
	public void aumento() {
		this.bonificacao = (getSalario() * (bonus / 100));
		setSalario((getSalario() * ((bonus / 100) + 1)));
	}

	@Override
	public String info() {
		return super.info() + "\nnome do usuario: " + usuario + "\nsenha: " + senha;
	}

}
