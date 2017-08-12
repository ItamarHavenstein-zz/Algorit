package Empresa;

import java.text.DecimalFormat;
import java.util.Calendar;

public class TrabalhadorPecaProduzida extends Empregado {
	DecimalFormat df = new DecimalFormat("#,##0.00");
	Calendar calendario = Calendar.getInstance();

	private double ganho;
	private int qtdPeca;
	private double remuneracao;

	public TrabalhadorPecaProduzida(String nome, String sobrenome, int qtdpecas, double remuneracao) {
		super(nome, sobrenome);
		this.qtdPeca = qtdpecas;
		this.remuneracao = remuneracao;
	}

	@Override
	public String SalarioMensal() {
		String salario = "";
		salario += "\nTrabalho por peça Produzida";
		salario += "\nNome: " + super.getNome() + " " + super.getSobrenome();
		salario += "\nPreço por peça: " + this.getRemuneracao()+"R$";
		salario += "\nQuantidade de peças: " + this.getQtdPeca();
		salario += "\nSalario do Mês: " + (calendario.get(Calendar.MONTH) + 1) + ", " + df.format(getGanho());
		return salario;
	}

	@Override
	public void CalculaGanho() {
		this.ganho = this.getRemuneracao() * this.getQtdPeca();
	}

	public double getGanho() {
		return ganho;
	}

	public void setGanho(double ganho) {
		this.ganho = ganho;
	}

	public int getQtdPeca() {
		return qtdPeca;
	}

	public void setQtdPeca(int qtdPeca) {
		this.qtdPeca = qtdPeca;
	}

	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
}
