package Static;

import java.text.DecimalFormat;

public class FuncionarioEscola {
	String nomeFun;
	double salarioFun;
	
	// construtor para aumento de salario
	void aumento (double valor){
		this.salarioFun += valor;
	}
	
	//metodo, mostra as informações do funcionario nome e salario
	public String info () {
		DecimalFormat df = new DecimalFormat();
		return this.nomeFun +",\nSalario "+ df.format(this.salarioFun);
	}
	//metodo
	public FuncionarioEscola(){
		this.salarioFun = 1000.00d;
	}
	//construtor
	public void alteranome(String nome){
		this.nomeFun = nome;
	}
	//construtor
	public void nomeFun(String nome) {
		this.nomeFun = nome;	
	}
	//construtor
	public void salarioFun(double salario) {
		this.salarioFun = salario;	
	}
	
}
