package exemplos.condicao;

public class CodicaoAguaPronta {//long var = 1000000l; , float var = 1000000.00f; , double var = 1000000.00d;
	
	public static void main(String[] args) {
		String _estadoAguaFervendo = "Fervendo";
		String _estadoAguaMorna = "Morna";
		String agua = "Morna";
		if(!_estadoAguaFervendo.equals(agua) || _estadoAguaMorna.equals(agua)){
			System.out.println("Água pronta para o café.");
		} else {
			System.out.println("Água não está pronta para o café");
		}
	}
}
