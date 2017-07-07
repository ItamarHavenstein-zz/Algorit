package JavaPrivate;

import java.util.Date;

import Orientacao_a_Objetos.Turma;

public class Aluno {
	
	private String nome;
	private String rg;
	private Date dataNasc;
	public Turma turma;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Turma getTurma() {
		return turma;
	}
	//preciso fazer para ter uma ligação entre as tabelas
	public void turma(Turma turma) {
		this.turma = turma;
		
	}
}
