package Empresa;

import java.text.DecimalFormat;
import java.util.Calendar;

public class TrabalhadorHora extends Empregado {
	DecimalFormat df = new DecimalFormat("#,##0.00");
	Calendar calendario = Calendar.getInstance();

	private double salarioHora;
	private double horasTrabalhadas;
	private double ganho;
	private double horaExtra;
	private double soma;

	public TrabalhadorHora(String nome, String sobrenome, double salariohora, double horatrabalhada) {
		super(nome, sobrenome);
		this.salarioHora = salariohora;
		this.horasTrabalhadas = horatrabalhada;
	}

	@Override
	public String SalarioMensal() {
		String salario = "";
		if(getHorasTrabalhadas()<= 220){
		salario += "\nTrabalho por Hora";
		salario += "\nNome: " + super.getNome() + "  " + super.getSobrenome();
		salario += "\nSalario por Hora: " + this.getSalarioHora();
		salario += "\nHoras Trabalhadas: " + this.getHorasTrabalhadas();
		salario += "\nSalario do mês: " + calendario.get(Calendar.MONTH) + "      -     " + df.format( this.ganho)+"R$";
		return salario;
				}
		if(getHorasTrabalhadas() > 220){
			salario += "\nTrabalho por Hora";
			salario += "\nNome: " + super.getNome() + "  " + super.getSobrenome();
			salario += "\nSalario por Hora: " + this.getSalarioHora();
			salario += "\nHoras Trabalhadas: " + this.getHorasTrabalhadas();
			salario += "\nHoras Extras: " + (this.getHorasTrabalhadas() - 220);
			salario += "\nSalario do mês: " + calendario.get(Calendar.MONTH) + "-" +df.format( (this.getHoraExtra() + this.getGanho()));
			salario += "\nHoras Normais: " + this.getSoma() + "      " + df.format(this.getGanho());
			salario += "\nHoras Extras: " + (this.getHorasTrabalhadas() - 220) + "      " + df.format(this.getHoraExtra());
			return salario;
		}
		return salario;
	}

	

	@Override
	public void CalculaGanho() {
		this.soma =( horasTrabalhadas - 220);
			
			this.horaExtra = soma * (salarioHora * ((50d / 100) + 1));
			
			this.ganho = (220d * salarioHora);
		
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double hora) {
		this.horasTrabalhadas = hora;
	}

	public double getGanho() {
		return ganho;
	}

	public void setGanho(double ganho) {
		this.ganho = ganho;
	}

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}
	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

}
