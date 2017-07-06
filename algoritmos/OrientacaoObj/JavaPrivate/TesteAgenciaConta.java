package JavaPrivate;

import java.text.DecimalFormat;

public class TesteAgenciaConta {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		/*depois de feito a mudança em agenciaBanco para seguir o exercicio 29, da um erro de compilação dizendo que não definimos
		 * corretamente o nosso construtor AgenciaBanco, então precisamos inserir os valores corretamente para que não apresente esse erro*/
		AgenciaBanco agencia = new AgenciaBanco(1234);

		Conta conta = new Conta("123456",123.34d);//cria a conta utilizando o construtor que criamos na classe Conta
		conta.setNumero(agencia);// = agencia;//vincula conta com a agenciaBanco
		/*não é mais preciso colocar o comando a seguir pois como criamos o construtor inserimos esse valor quando criamos a agenciaBanco 
		 * no inicio do programa*/
		//conta.numero.numeroAgencia = 12534;
		
		System.out.println("O numero da conta "+conta.getNumeroConta()+" da agência "
				+conta.getNumero()+" tem saldo de "+df.format(conta.getSaldoConta())+".");
		
	}
}
