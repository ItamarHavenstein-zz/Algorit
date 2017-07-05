package Orientacao_a_Objetos;

import java.text.DecimalFormat;

public class FuncionarioEscola {
	String nomeFun;
	double salarioFun;
	
	// metodo para aumento de salario do funcionario
	void aumento (double valor){
		this.salarioFun += valor;
	}
	
	//mostra as informações do funcionario nome e salario
	public String info () {
		DecimalFormat df = new DecimalFormat();
		return this.nomeFun +",\nSalario "+ df.format(this.salarioFun);
	}
}
