package JavaPrivate;

public class TesteTurma {
	public static void main(String[] args) {
		Turma turma1 = new Turma ();
		turma1.periodo = "Matutino";
	    turma1.serie = 1;
	    turma1.sigla = "MAT";
	    turma1.tipoEnsino ="Presencial";
	    System.out.println("Periodo "+turma1.periodo+
	    " da serie "+turma1.serie+
	    " da turma "+turma1.sigla+
	    " com tipo de ensino "+turma1.tipoEnsino);
	    
	    
	    
	}
}
