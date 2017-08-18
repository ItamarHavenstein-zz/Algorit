package BancoEspecial;

public class TesteConta {
	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente("Andre Montes", "12345687", "Gaspar", 1500, 100, "12245-6");
		System.out.println("Saldo da conta: "+conta.getSaldo());
		conta.saca(100d);
		System.out.println("Saldo da conta: "+conta.getSaldo());
		conta.deposita(150d);
		System.out.println("Saldo da conta: "+conta.getSaldo());
		
		ContaCorrenteEspecial contaE = new ContaCorrenteEspecial("Alfredo dos Santos","9875642","Indaial",2560, 250, "36548-5");
		System.out.println("Saldo da conta: "+contaE.getSaldo());
		contaE.saca(200d);
		System.out.println("Saldo da conta: "+contaE.getSaldo());
		contaE.deposita(150d);
		System.out.println("Saldo da conta: "+contaE.getSaldo());
		
		System.out.println("\n"+Extrato.gerarExtratoConta(conta));
		System.out.println(Extrato.gerarExtratoEspecial(contaE));
	}
}
