package Empresa;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Chefe extends Empregado {
	DecimalFormat df = new DecimalFormat("#,##0.00");
	Calendar calendario = Calendar.getInstance();

	private double ganho;
	private double salario = 5000;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Chefe(String nome, String sobrenome) {
		super(nome, sobrenome);

	}

	@Override
	public String SalarioMensal() {
		String salario = "";
		salario += "\nChefe";
		salario += "\nNome: " + super.getNome() + " " + super.getSobrenome();
		salario += "\nSalario do Mês " + (calendario.get(Calendar.MONTH) + 1) + ", " + df.format(ganho) + "R$";
		return salario;
	}

	@Override
	public void CalculaGanho() {
		this.ganho = salario;
	}

	public double getGanho() {
		return ganho;
	}

	public void setGanho(double ganho) {
		this.ganho = ganho;
	}
}
