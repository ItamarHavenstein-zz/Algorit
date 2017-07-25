package Interfaces;

public class TesteConta {

	public static void main(String[] args) {
		Agencia agencia = new Agencia("125");
		
		ContaCorrente contac = new ContaCorrente("Paulo de Andrade", "1245", 5689.54d, 200d, 15.50d);
		contac.setAgencia(agencia);
		
	
		
	
		
		ContaPoupanca contap = new ContaPoupanca("Maria de Andrade","89754",2564.56d,25.58d);
		contap.setAgencia(agencia);
		
		//System.out.println(con.geradordeExtrato());
		System.out.println(contap.geradordeExtrato());
		
		contac.deposita(500d);
		
	}
}
