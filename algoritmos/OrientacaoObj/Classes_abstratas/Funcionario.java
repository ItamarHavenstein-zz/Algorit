/**
 * Este pacote é responsável pelas classes dos funcionarios
 */
package Classes_abstratas;

/**
 * Esta classe é responsável pelo funcionario
 * 
 * @author Noturno
 *
 */
public abstract class Funcionario {
	/**
	 * nome, codigo estes são atributos da classe funcionario
	 */
	private String nome;
	private int codigo;

	public abstract void informacoes();

	public abstract void bonificacao();

	public Funcionario() {
		super();
	}

	/**
	 * Este construtor é responsável pelo funcionário
	 * 
	 * @param nome:
	 *            este parametro é responsável pelo nome
	 * @param codigo:
	 *            este parametro é responsável pelo codigo
	 */
	public Funcionario(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
