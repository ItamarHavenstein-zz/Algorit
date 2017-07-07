package Static;

import java.text.DecimalFormat;

public class FuncionarioEscola {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	String nomeFun;
	double salarioFun;
    double valeRefeicao = 10d;
	
	// construtor para aumento de salario
	void aumento (double valor){
		this.salarioFun += valor;
	}
	
	//metodo, mostra as informações do funcionario nome,salario e vale refeição
	public String info () {
		return this.nomeFun +
				",\nSalario "+ df.format(this.salarioFun)+"R$"+
				"\ncom vale Refeição de "+df.format(valeRefeicao)+"R$ ao dia.";
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
	//
	public void ValeRefeicao(double taxa){
		this.valeRefeicao = valeRefeicao *((taxa/100)+1);
	}
}
