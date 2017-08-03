package CompaniaAerea;

import java.text.DecimalFormat;

import java.util.ArrayList;

public class TesteAereo {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0.00R$");
		// Criado a compania aerea
		CompaniaAerea azul = new CompaniaAerea();

		// Avioes Da compania Aerea
		Boing boing1 = new Boing(50, 100d);
		Boing boing2 = new Boing(50, 100d);
		Boing boing3 = new Boing(30, 100d);
		// Criando a lista dos boings
		ArrayList<Boing> boings = new ArrayList();
		boings.add(boing2);
		boings.add(boing1);
		boings.add(boing3);
		// Adicionando a lista dos boings dentro da compania aeres criada
		azul.setBoing(boings);
		// Avioes Da compania Aerea
		Monomotor mono1 = new Monomotor(4, 200d);
		Monomotor mono2 = new Monomotor(4, 200d);
		Monomotor mono3 = new Monomotor(4, 200d);
		// Criando a lista dos monomotores
		ArrayList<Monomotor> monomotor = new ArrayList();
		monomotor.add(mono3);
		monomotor.add(mono2);
		monomotor.add(mono1);
		// Adicionando a lista dos monomotores dentro da compania aeres criada
		azul.setMonomotor(monomotor);
		// Criando a lista dos bimotores
		Bimotor bimo1 = new Bimotor(16, 300d);
		Bimotor bimo2 = new Bimotor(16, 300d);
		// Criando a lista dos bimotores
		ArrayList<Bimotor> bimo = new ArrayList();
		bimo.add(bimo2);
		bimo.add(bimo1);
		// Adicionando a lista dos bimotoresF dentro da compania aeres criada
		azul.setBimotor(bimo);

	System.out.println("faturamento do compania aerea Azul: " + df.format(azul.Faturamento()));

	//fazer o teste desta nova companhia.
		// uma nova companhia aerea
		CompaniaAerea LATAM = new CompaniaAerea();
		
		//Criando os boings
		Boing fly = new Boing(50, 100d);
		Boing fly1 = new Boing(30, 100d);
		
		//Criando o arraylist e adcionando os boings dentro
		ArrayList<Boing> aviao = new ArrayList();
		aviao.add(fly1);
		aviao.add(fly);
		
		//adicionando a lista dos avioes boing dentro da companhia
		LATAM.setBoing(aviao);
		
		//System.out.println("Faturamento da companhia da LATAM: "+LATAM.Faturamento());

	}
}
