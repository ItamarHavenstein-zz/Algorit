package JavaPolimorfismo;

import java.text.DecimalFormat;

public class Extratos {
	static DecimalFormat df = new DecimalFormat("#0.00");

	public static String gerarExtrato(ContaCorrente conta) {
		String extrato = "";
		extrato += "Cliente: " + conta.getCliente().getRg() + " - " + conta.getCliente().getNome();
		extrato += "\nNúmero da Conta: " + conta.getNumConta();
		extrato += "\nSaldo da Conta: " + df.format(conta.getSaldo());
		extrato += "\nNúmero da Agência: " + conta.getAgencia().getAgencia();
		return extrato;
}}
