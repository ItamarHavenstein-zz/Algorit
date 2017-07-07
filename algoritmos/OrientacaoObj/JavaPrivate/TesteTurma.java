package JavaPrivate;

public class TesteTurma {
	public static void main(String[] args) {
		Turma turma1 = new Turma ();
		turma1.setPeriodo("matutino"); 
	    turma1.setSerie(1);
	    turma1.setSigla("JAV");
	    turma1.setTipoEnsino("Presencial");
	    System.out.println("Periodo "+turma1.getPeriodo()+
	    " da serie "+turma1.getSerie()+
	    " da turma "+turma1.getSigla()+
	    " com tipo de ensino "+turma1.getTipoEnsino());
	    
	    
	    
	}
}
