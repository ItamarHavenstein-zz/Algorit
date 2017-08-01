package CompaniaAerea;

import java.util.ArrayList;

public class TesteAereo {

	public static void main(String[] args) {
		// Criado a compania aerea
		CompaniaAerea azul = new CompaniaAerea();

		// Avioes Da compania Aerea
		Boing boing1 = new Boing(50, 100d);
		Boing boing2 = new Boing(50, 100d);
		// Criando a lista dos boings
		ArrayList<Boing> boings = new ArrayList();
		boings.add(boing2);
		boings.add(boing1);
		// Adicionando a lista dos boings dentro da compania aeres criada
		azul.setBoing(boings);
		// Avioes Da compania Aerea
		Monomotor mono1 = new Monomotor(4, 200);
		Monomotor mono2 = new Monomotor(4, 200);
		Monomotor mono3 = new Monomotor(4, 200);
		// Criando a lista dos monomotores
		ArrayList<Monomotor> monomotor = new ArrayList();
		monomotor.add(mono3);
		monomotor.add(mono2);
		monomotor.add(mono1);
		// Adicionando a lista dos monomotores dentro da compania aeres criada
		azul.setMonomotor(monomotor);
		// Criando a lista dos bimotores
		Bimotor bimo1 = new Bimotor(16, 300);
		Bimotor bimo2 = new Bimotor(16, 300);
		// Criando a lista dos bimotores
		ArrayList<Bimotor> bimo = new ArrayList();
		bimo.add(bimo2);
		bimo.add(bimo1);
		// Adicionando a lista dos bimotoresF dentro da compania aeres criada
		azul.setBimotor(bimo);

		System.out.println(azul.Fatura());

	}
}
