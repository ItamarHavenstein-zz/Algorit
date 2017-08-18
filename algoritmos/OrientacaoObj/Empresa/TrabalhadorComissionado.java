package Empresa;

import java.text.DecimalFormat;

public class TrabalhadorComissionado extends Empregado {
	DecimalFormat df = new DecimalFormat("#,##0.00");

	private double comissao;
	private double vendaTotal;
	private double salario;
	private double ganho;

	public TrabalhadorComissionado(String nome, String sobrenome, double comissao, double vendaTotal, double salario) {
		super(nome, sobrenome);
		this.comissao = comissao;
		this.vendaTotal = vendaTotal;
		this.salario = salario;
	}

	@Override
	public void CalculaGanho() {
		this.ganho = (this.getComissao() / 100) * this.getVendaTotal();
	}

	@Override
	public String SalarioMensal() {
		String salario = "";
		salario += "\nTrabalhador Comissionado";
		salario += "\nComissão: " + this.getComissao() + "%";
		salario += "\nVenda Mensal: " + df.format(this.getVendaTotal()) + "R$";
		salario += "\nSalario fixo: " + df.format(getSalario()) + "R$";
		salario += "\nSalário mais comissão: " + df.format(this.getSalario() + this.getGanho()) + "R$";
		return salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getVendaTotal() {
		return vendaTotal;
	}

	public void setVendaTotal(double vendaTotal) {
		this.vendaTotal = vendaTotal;
	}

	public double getGanho() {
		return ganho;
	}

	public void setGanho(double ganho) {
		this.ganho = ganho;
	}

}
