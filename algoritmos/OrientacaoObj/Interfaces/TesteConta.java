package Interfaces;

public class TesteConta {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		agencia.setAgencia("1235");
		ContaCorrente contac = new ContaCorrente("Paulo de Andrade", "1245", 5689.54d, 200d, 15.50d);
		
		ContaPoupanca contap = new ContaPoupanca("Maria de Andrade","89754",2564.56d,25.58d);
		
		System.out.println(contac.geradordeExtrato());
	}
}
