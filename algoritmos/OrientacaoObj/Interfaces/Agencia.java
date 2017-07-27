/**
 * este pacote é reponsavel pelas classes de uma conta
 */
package Interfaces;
/**
 * Este é uma classe da agencia
 * @author Noturno
 *
 */
public class Agencia {
	/**
	 * este é um atributo responsável do numero da agencia
	 * 
	 */
	private String agencia;
	/**
	 * Este é um construtor da classe
	 * @param agencia este parametro é responsavel pelo numero da agencia
	 */
	public Agencia(String agencia){
		this.agencia = agencia;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
}
