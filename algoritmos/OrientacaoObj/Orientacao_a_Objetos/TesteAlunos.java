package Orientacao_a_Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAlunos {
	
	public static void main(String[] args)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Paulo";
		aluno1.rg = "73366737";
		aluno1.dataNasc = sdf.parse("05/12/1990");
		System.out.println(" O nome do aluno "+aluno1.nome+
		", rg "+aluno1.rg+
		" data de nascimento "+sdf.format(aluno1.dataNasc));
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Mario";
		aluno2.rg = "582748298";
		aluno2.dataNasc = sdf.parse("19/04/2000");
		System.out.println(aluno2.nome);
		System.out.println(aluno2.rg);
		System.out.println(aluno2.dataNasc);
		
	}
}
