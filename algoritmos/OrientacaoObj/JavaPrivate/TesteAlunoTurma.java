package JavaPrivate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Orientacao_a_Objetos.Turma;

public class TesteAlunoTurma {

	public static void main(String[] args) throws ParseException {
		// formatar a data de nascimento do aluno
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		/*
		 * //inserção dos valores nas variaveis da tabela aluno
		 * alu.setNome("pedro"); alu.setDataNasc(sdf.parse("10/10/1990"));
		 * alu.setRg("256589874"); //inserção dos valores nas variaveis da
		 * tabela turma utilizando a ligação entre tabelas
		 * alu.turma.setPeriodo("Matutino"); alu.turma.serie = 2;
		 * alu.turma.sigla = "Java"; alu.turma.tipoEnsino = "Semi-Presencial";
		 * 
		 * System.out.println("O aluno "+alu.nome+" nasceu em "+sdf.format(alu.
		 * dataNasc)+
		 * "\n com o rg de numero "+alu.rg+" estuda no periodo "+alu.turma.
		 * periodo+
		 * "\n na serie "+alu.turma.serie+" do curso de "+alu.turma.sigla+
		 * "\n com tipo de ensino "+alu.turma.tipoEnsino);
		 */

		// Criação do objeto Turma com suas informações
		Turma turma = new Turma();
		turma.setPeriodo("Matutino");
		turma.setSerie(1);
		turma.setSigla("JAV");
		turma.setTipoEnsino("Presencial");

		// Criação do objeto Aluno com suas informações
		Aluno aluno = new Aluno();
		aluno.setNome("José");
		aluno.setRg("123456");
		aluno.setDataNasc(sdf.parse("01/01/1995"));

		// Criação do vínculo entre turma e aluno
		aluno.turma(turma);

		System.out.println("O aluno " + aluno.getNome() + " com RG " + aluno.getRg() + " que nasceu no dia "
				+ sdf.format(aluno.getDataNasc()) + " pertence a turma " + aluno.turma.getSigla() + " do período "
				+ aluno.turma.getPeriodo() + " da serie " + aluno.turma.getSerie() + " do tipo de ensino "
				+ aluno.turma.getTipoEnsino());

	}
}
