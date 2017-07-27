/**
 * Este pacote é responsavel pela classe da conta 
 */
package Interfaces;
/**
 * Esta classe é responsável pelo banco
 * @author Noturno
 *
 */
public interface Banco {
	/**
	 * Estes metodos são responsáveis por depositar e sacar
	 * @param valor: este parametro é responsável pelo valor a ser acresentado ou decrementado da conta 
	 */
	void deposita (double valor);
	void saca(double valor);
	
	
}
