package JavaPrivate;

public class AgenciaBanco {
	private int numeroAgencia;
	
	//com o get eu acesso os valores da variavel
	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	//com o set eu altero,modifico os valores da variavel
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	//Construtores
	public AgenciaBanco(int numero){
		this.numeroAgencia = numero;
	}
}
