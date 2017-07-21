package Enum;

public class TesteEnum {

	public static void Exemplo(Exemplo opcao){
		if(opcao == Exemplo.SALVAR){
			System.out.println("Salvando o arquivo!");
		}
		else if(opcao == Exemplo.ABRIR){
			System.out.println("Abrindo o arquivo!");
		}
	}


	public static void main(String[] args) {
		Exemplo(Exemplo.ABRIR);	
	}

	}

