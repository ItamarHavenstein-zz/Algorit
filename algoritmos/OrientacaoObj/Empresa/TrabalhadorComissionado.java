package Empresa;

import java.text.DecimalFormat;

public class TrabalhadorComissionado extends Empregado {
	DecimalFormat df = new DecimalFormat("#.##0,00");

	private double comissao;
	private double vendaTotal;

	public TrabalhadorComissionado(String nome, String sobrenome, double salario, double comissao, double vendaTotal) {
		super(nome, sobrenome, salario);
		this.comissao = comissao;
		this.vendaTotal = vendaTotal;
	}

	@Override
	public String CalculaGanho() {
		String salario = "";
		salario += "Trabalhador Comissionado";
		salario += "Comissão: "+this.getComissao()+"%";
		salario += "Venda Mensal: "+df.format(this.getVendaTotal())+"R$";
		salario += "Salário: "+df.format(super.getSalarioMensal()+(((this.getComissao()/100)+1)* this.getVendaTotal()));
		return salario;
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

}
