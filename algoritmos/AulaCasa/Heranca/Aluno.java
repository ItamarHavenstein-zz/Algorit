package Heranca;

import java.util.Date;

public class Aluno extends Pessoa {

	
	private String matricula;
	private String turma;
	private String periodo;
	
	//criando get e set
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	//construtor
	public Aluno(String nome, Date data, int idade, String rg, String matricula, String turma, String periodo) {
		super(nome, data, idade, rg);
		this.setMatricula(matricula);
		this.setPeriodo(periodo);
		this.setTurma(turma);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String Informacoes() {
		System.out.println("Informações do aluno");
		return super.Informacoes()+
				"\nNumero da matricula "+this.getMatricula()+
				"\nPeriodo "+this.getPeriodo()+
				"\nTurma "+this.getTurma();
		
	}
}
