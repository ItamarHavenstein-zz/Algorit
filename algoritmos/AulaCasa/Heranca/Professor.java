package Heranca;

import java.text.DecimalFormat;
import java.util.Date;

public class Professor extends Pessoa{
	DecimalFormat df = new DecimalFormat("#0.00");
	

	private double salario;
	private String registro;
	private String disciplina;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	//construtor
	public Professor(String nome, Date data, int idade, String rg, double salario, String registro, String disciplina) {
		super(nome, data, idade, rg);
		this.setSalario(salario);
		this.setRegistro(registro);
		this.setDisciplina(disciplina);
	}
	@Override
	public String Informacoes() {
		System.out.println("Informações do Professor");
		return super.Informacoes()+
				"\nSalario "+df.format(this.getSalario())+
				"\nRegistro do Professor "+this.getRegistro()+
				"\nDicsciplina "+this.getDisciplina();
		}
}
