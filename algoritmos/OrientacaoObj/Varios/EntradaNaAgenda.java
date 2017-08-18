package Varios;

public class EntradaNaAgenda extends DataHora {

	public EntradaNaAgenda(byte dia, byte mês, short ano) {
		super(dia, mês, ano);
		// TODO Auto-generated constructor stub
	}
	//falta criar o get e set do nosso atributo.
	
	//private String evento;
	
	//public EntradaNaAgenda(byte dia, byte mês, short ano, byte hor, byte min, byte seg, String eve) {
	//	super(dia, mês, ano, hor, min, seg);
	//	evento = eve;
	
	/*no primeiro retorno não precisamos usar dois super, so um já funciona,
	a variavel eve que esta escrita no metodo só vai funcionar dentro do construtor 
 fora do construtor é preciso utilizar a variavel evento*/
	
//public String toString(){
	//return super.super.toString()+" "+super.toString()+"-> "+eve;

}
