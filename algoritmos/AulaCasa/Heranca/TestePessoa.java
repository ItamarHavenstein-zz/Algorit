package Heranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestePessoa {
	 
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno = new  Aluno();
		aluno.setDataNascimento(sdf.parse("10/10/2002"));
		aluno.setIdade(20);
		aluno.setMatricula("1256");
		aluno.setNome("Itamar");
		aluno.setPeriodo("Noturno");
		aluno.setRg("12345678");
		aluno.setTurma("Comércio");
		
		Professor prof = new Professor();
		prof.setDataNascimento(sdf.parse("10/02/1980"));
		prof.setDisciplina("Administração");
		prof.setIdade(40);
		prof.setNome("Pamela");
		prof.setRegistro("00023");
		prof.setRg("98765432");
		prof.setSalario(1568.65d);
		
		//mostrar dados
		System.out.println(aluno.Informacoes());
		System.out.println(prof.Informacoes());
		
		
		Aluno aluno1 = new Aluno("Administração", "Noturno", "1235", "José", "15/08/1945", 80, "12345678");
				
		System.out.println(aluno1.Informacoes());
		
	
	}
}
