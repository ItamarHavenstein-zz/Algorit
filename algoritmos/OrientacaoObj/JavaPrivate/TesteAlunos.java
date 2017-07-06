package JavaPrivate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAlunos {
	
	public static void main(String[] args)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("paulo"); 
		aluno1.setRg("73366737"); 
		aluno1.setDataNasc(sdf.parse("05/12/1990"));
		System.out.println(" O nome do aluno "+aluno1.getNome()+
		", rg "+aluno1.getRg()+
		" data de nascimento "+sdf.format(aluno1.getDataNasc()));
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Mario"); 
		aluno2.setRg("582748298");
		aluno2.setDataNasc(sdf.parse("19/04/2000"));
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getRg());
		System.out.println(sdf.format(aluno2.getDataNasc()));
		
	}
}
