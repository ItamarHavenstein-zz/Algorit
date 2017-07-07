package JavaHeranca;

import java.text.DecimalFormat;

public class TesteFuncionarios {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		// criando 1 gerente
		Gerente gerente = new Gerente();
		gerente.setCodigo("1");
		gerente.setNome("Mauricio");
		gerente.setUsuario("mau");
		gerente.setSenha("13456");
		gerente.setSalario(7000.00d);
		// imprime na tela
		System.out.println("O codigo: " + gerente.getCodigo() + " pertence ao gerente " + gerente.getNome()
				+ " sendo usuário " + gerente.getUsuario() + " tendo a senha " + gerente.getSenha() + " com salario de "
				+ df.format(gerente.getSalario()) + "R$");
		// aumento de 20% para o gerente, é um aumento diferente pois o metodo
		// está dentro da classe.
		gerente.aumento();
		// imprime na tela após o aumento
		System.out.println("Novo salario do gerente e: " + df.format(gerente.getSalario()));

		// criando 1 secretaria
		Secretarias secretaria = new Secretarias();
		secretaria.setCodigo("2");
		secretaria.setNome("Paula");
		secretaria.setRamal("220");
		secretaria.setSalario(2556.25d);
		// imprime na tela
		System.out.println("O codigo: " + secretaria.getCodigo() + " pertence a secretaria " + secretaria.getNome()
				+ " com o ramal: " + secretaria.getRamal() + ", e salario de " + df.format(secretaria.getSalario())
				+ "R$");
		// aumento de 10% para secretaria
		secretaria.aumento();
		// imprime depois do aumento
		System.out.println("Novo salario do gerente e: " + df.format(secretaria.getSalario()));

		// criando 1 telefonista
		Telefonistas telefonista = new Telefonistas();
		telefonista.setCodigo("3");
		telefonista.setNome("Marcos");
		telefonista.setEstacaoTrabalho("matriz");
		telefonista.setSalario(1256.32d);
		// imprime na tela
		System.out.println("O codigo: " + telefonista.getCodigo() + " pertence ao telefonista " + telefonista.getNome()
				+ " que trabalha na " + telefonista.getEstacaoTrabalho() + " com salario de "
				+ df.format(telefonista.getSalario()) + "R$");
		// aumento de 10% para o telefonista
		telefonista.aumento();
		// imprime depois do aumento
		System.out.println("Novo salario do gerente e: " + df.format(telefonista.getSalario()));

		System.out.println(gerente.info() + "\n" + telefonista.info() + "\n" + secretaria.info());
	}
}
