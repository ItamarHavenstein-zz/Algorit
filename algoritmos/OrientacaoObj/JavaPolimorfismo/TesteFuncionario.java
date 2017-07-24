package JavaPolimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerentes g = new Gerentes();
		g.setCodigo(1);
		g.setSenha("paulo");
		g.setUsuario("Paulo Dos Santos");
		Funcionarios f = g;
		
		Telefonista t = new Telefonista();
		t.setCodigo(2);
		t.setRamal(150);
		t.setUsuario("Maria Das Dores");
		Funcionarios f1 = t;
		
		System.out.println("Nome: "+g.getUsuario());
		f.registraEntrada(g);
		f.registraSaida(g);
		
		
	}
}
