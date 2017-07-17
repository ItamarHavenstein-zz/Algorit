package Heranca;

import java.text.DecimalFormat;

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
	public void  Dados( double salario, String registro, String disciplina) {
		this.setSalario(salario);
		this.setRegistro(registro);
		this.setDisciplina(disciplina);
	}
	@Override
	public String Informacoes() {
		System.out.println("\nInformações do Professor");
		return super.Informacoes()+
				"\nSalario "+df.format(this.getSalario())+"R$"+
				"\nRegistro do Professor "+this.getRegistro()+
				"\nDicsciplina "+this.getDisciplina();
		}
}
