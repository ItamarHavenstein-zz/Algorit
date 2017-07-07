package JavaHeranca;

import java.text.DecimalFormat;

public class Funcionarios {

	DecimalFormat df = new DecimalFormat("#0.00");

	private String nome;
	private String codigo;
	private double salario;
	double bonificacao;

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/*
	 * metodo criado para fazer o aumento de salario dos funcionarios, para a
	 * operação matematica funcionar corretamente precisa ser colocar
	 * numero(d)depois do numero inserir a letra d minuscula pois só assim o
	 * computador vai fazer a operação correta e trazer como resultado 0.1,
	 * senao o programa irá aredondar o calculo para 0.
	 */
	public void aumento() {
		this.bonificacao = salario * (10d / 100);
		this.salario = salario * ((10d / 100) + 1);
	}

	public String info() {
		String info = "";
		info += "\nNome do funcionario: " + nome;
		info += "\nsalario do funcionario: " + df.format(salario) + "R$";
		info += "\nbonus para funcionario: " + df.format(bonificacao) + "R$";
		return info;
	}

}
