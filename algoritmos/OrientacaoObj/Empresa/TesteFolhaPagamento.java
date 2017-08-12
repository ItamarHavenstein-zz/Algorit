package Empresa;


import java.text.SimpleDateFormat;


public class TesteFolhaPagamento {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Chefe chefe = new Chefe("Mario","Andrade");
		
		chefe.CalculaGanho();
		chefe.SalarioMensal();
		System.out.println(chefe.SalarioMensal());
		
		TrabalhadorPecaProduzida trapc = new TrabalhadorPecaProduzida("Marcos", "Ambrosio", 1000, 10d);
		
		trapc.CalculaGanho();
		System.out.println(trapc.SalarioMensal());
		
		TrabalhadorHora trahora = new TrabalhadorHora("Mauricio", "nobre", 6.45, 200);
		trahora.CalculaGanho();
		System.out.println(trahora.SalarioMensal());
		
		TrabalhadorHora trahora1 = new TrabalhadorHora("Maria", "Da Silva", 7.30, 300);
		trahora.CalculaGanho();
		System.out.println(trahora1.SalarioMensal());
		System.out.println(trahora1.getHoraExtra());
		
	}
}
