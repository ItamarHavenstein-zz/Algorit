package exemplos.condicao;

public class CodicaoAguaPronta {//long var = 1000000l; , float var = 1000000.00f; , double var = 1000000.00d;
	
	public static void main(String[] args) {
		String _estadoAguaFervendo = "Fervendo";
		String _estadoAguaMorna = "Morna";
		String agua = "Morna";
		if(!_estadoAguaFervendo.equals(agua) || _estadoAguaMorna.equals(agua)){
			System.out.println("�gua pronta para o caf�.");
		} else {
			System.out.println("�gua n�o est� pronta para o caf�");
		}
	}
}
