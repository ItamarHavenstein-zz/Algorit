package Heranca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	

	private String nome;
	private Date dataNascimento;
	private int idade;
	private String rg;
	
	//criação dos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	//construtor
	public Pessoa (String nome, Date data, int idade, String rg){
		this.setNome(nome);
		this.setDataNascimento(data);
		this.setIdade(idade);
		this.setRg(rg);
	}
	public String Informacoes(){
		String info = "";
		info += "\nNome: "+this.getNome();
		info += "\nData Nascimento "+sdf.format(this.getDataNascimento());
		info += "\nIdade "+this.getIdade();
		info += "\nNumero do Rg: "+this.getRg();
		return  info;
		
	}
	
	
	
}
