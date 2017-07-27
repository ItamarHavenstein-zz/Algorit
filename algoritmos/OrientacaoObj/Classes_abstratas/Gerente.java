/**
 * Este pacote é responsável pelas classes dos funcionarios
 */
package Classes_abstratas;

import java.text.DecimalFormat;

/**
 * Esta classe é responsável pelo gerente
 * 
 * @author Noturno
 *
 */
public class Gerente extends Funcionario {
	DecimalFormat df = new DecimalFormat("#,##0.00");

	/**
	 * senha, salario, bonus, bonifica são atributos da classe gerente
	 */
	private String senha;
	private double salario;
	private double bonus;
	private double bonifica;

	// metodo padrao
	public Gerente() {
		super();
	}

	// construtor
	/**
	 * Este construtor é responsável pelo gerente
	 * 
	 * @param nome:
	 *            este parametro é responsável pelo nome
	 * @param codigo:
	 *            este parametro é responsável pelo codigo
	 * @param senha:
	 *            este parametro é responsável pela senha
	 * @param salario:
	 *            este parametro é responsável pelo salario
	 * @param bonus:
	 *            este parametro é responsável pelo bonus
	 * @param bonifica:
	 *            este parametro
	 */
	public Gerente(String nome, int codigo, String senha, double salario, double bonus) {
		super(nome, codigo);
		this.senha = senha;
		this.salario = salario;
		this.bonus = bonus;
	}

	@Override
	public void informacoes() {
		System.out.println("INformações do Gerente");
		System.out.println("Nome: " + this.getNome() + "\nCodigo: " + this.getCodigo() + "\nSenha: " + this.getSenha()
				+ "\nSalario: " + df.format(getSalario()) + "R$" + "\nBonificação de " + df.format(this.getBonifica())
				+ "\nNovo Salário: " + df.format(getBonifica() + getSalario()) + "R$");

	}

	@Override
	public void bonificacao() {
		
		this.bonifica = salario * ((bonus / 100d) + 1);
		this.bonifica = bonifica - salario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonifica() {
		return bonifica;
	}

	public void setBonifica(double bonifica) {
		this.bonifica = bonifica;
	}

}
