package Orientacao_a_Objetos;

import java.text.DecimalFormat;

public class FuncionarioEscola {
	String nomeFun;
	double salarioFun;
	
	void aumento (double valor){
		this.salarioFun += valor;
	}
	public String info () {
		DecimalFormat df = new DecimalFormat();
		return this.nomeFun +", salario novo "+ df.format(this.salarioFun);
				}
}
