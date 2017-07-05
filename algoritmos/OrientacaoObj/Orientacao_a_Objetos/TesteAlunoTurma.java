package Orientacao_a_Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAlunoTurma {
	
	public static void main(String[] args) throws ParseException {
		//formatar a data de nascimento do aluno
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Aluno alu = new Aluno();
		Turma tur = new Turma();
		alu.turma = tur;//ligação entre a tabela aluno e a tabela turma
		
		//inserção dos valores nas variaveis da tabela aluno
		alu.nome = "Pedro";
		alu.dataNasc = sdf.parse("10/10/1990"); 
		alu.rg = "256589874";
		//inserção dos valores nas variaveis da tabela turma utilizando a ligação entre tabelas
		alu.turma.periodo = "Matutino";
		alu.turma.serie = 2;
		alu.turma.sigla = "Java";
		alu.turma.tipoEnsino = "Semi-Presencial";
		
		System.out.println("O aluno "+alu.nome+" nasceu em "+sdf.format(alu.dataNasc)+
				"\n com o rg de numero "+alu.rg+" estuda no periodo "+alu.turma.periodo+
				"\n na serie "+alu.turma.serie+" do curso de "+alu.turma.sigla+
				"\n com tipo de ensino "+alu.turma.tipoEnsino);
		
	}
}
