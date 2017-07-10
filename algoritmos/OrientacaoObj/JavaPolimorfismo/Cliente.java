package JavaPolimorfismo;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String rg;
	private Date dataNasc;
	private String cidade;
	
	//busca nome
	public String getNome() {
		return nome;
	}
	//inseri, altera nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	//busca rg
	public String getRg() {
		return rg;
	}
	//inseri,altera rg
	public void setRg(String rg) {
		this.rg = rg;
	}
	//busca data de nascimento
	public Date getDataNasc() {
		return dataNasc;
	}
	//inseri, altera data de nascimento 
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	//busca a cidade
	public String getCidade() {
		return cidade;
	}
	//inseri, altera a cidade
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
