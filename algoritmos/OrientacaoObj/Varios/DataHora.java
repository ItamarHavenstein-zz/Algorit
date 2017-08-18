package Varios;

public class DataHora extends Lista4Exercicio5{

	public DataHora(byte dia, byte mês, short ano) {
		super();
		// TODO Auto-generated constructor stub
	}
	/*falta fazer o get e set, não existe um atributo do tipo Hora, precisa ser do tipo Date para funcionar
	 *  */
	
	//private Hora hora;
	
	/*aqui temos nosso construtor que herda da classe mae os atributos que forram instanciados lá,
	 * e é colocado mais atributos para colocarmos os valores, como foi configurado errado o atributo não 
	 * vamos conseguir  crialo*/
	
//public DataHora(byte dia, byte mês, short ano, byte hor, byte min, byte seg) {
	//	super(dia, mês, ano);
	//	hora = new Hora(hor,min,seg);

//o metodo toString ele tambem extende da classe mae, como o atributo esta configurado errado
//aparecera erro quando atribuimos  a hora para ser informada no console
	
//public String toString(){
//	return super.toString()+" "+hora.toString();
}

