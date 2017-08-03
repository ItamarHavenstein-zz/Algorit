package BancoEspecial;

public class Extrato {


	public static String gerarExtratoConta(ContaCorrente c) {
		String extrato = "";
		extrato += "\nExtrato da Conta Corrente";
		extrato += "\n\nNome do Cliente: " + c.getNome();
		extrato += "\nRG do Cliente: " + c.getRg();
		extrato += "\nCidade do Cliente: " + c.getCidade();
		extrato += "\nNumero da Conta: " + c.getNumConta();
		extrato += "\nSaldo Da conta: " + c.getSaldo();
		extrato += "\nLimite da Conta: " + c.getLimite();
		return extrato;
	}
	
	public static String gerarExtratoEspecial (ContaCorrenteEspecial c){
		String extrato = "";
		extrato += "\nExtrato da Conta Corrente Especial";
		extrato += "\n\nNome do Cliente: " + c.getNome();
		extrato += "\nRG do Cliente: " + c.getRg();
		extrato += "\nCidade do Cliente: " + c.getCidade();
		extrato += "\nNumero da Conta: "+c.getNumConta();
		extrato += "\nSaldo Da conta: " + c.getSaldo();
		extrato += "\nLimite da Conta: " + c.getLimite();
		return extrato;
	}
}
