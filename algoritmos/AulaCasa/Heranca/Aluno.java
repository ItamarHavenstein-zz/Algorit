package Heranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa  {
SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

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
	
	@Override
	public String Informacoes() {
		System.out.println("\nInformações do aluno");
		return super.Informacoes()+
				"\nNumero da matricula "+this.getMatricula()+
				"\nPeriodo "+this.getPeriodo()+
				"\nTurma "+this.getTurma();
	}
	//metodo padrao
	public Aluno(){
		
	}
	//construtor
	public Aluno(String turma, String periodo, String matricula,String nome,String dataNascimento,int idade,String rg) throws ParseException{
		this.matricula = matricula;
		this.periodo = periodo;
		this.turma = turma;
		this.setNome(nome);
		this.setDataNascimento(sdf.parse(dataNascimento));
		this.setIdade(idade);
		this.setRg(rg);
	}
}
