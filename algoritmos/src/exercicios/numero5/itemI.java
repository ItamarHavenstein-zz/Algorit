package exercicios.numero5;
/* i. if(true & (false | false)) { 
	System.out.println(“Entrou no if”);
} else {
	System.out.println(“Não entrou no if”);
}
*/
public class itemI {
	
	public static void main(String[] args) {/*se na condicao do if o primeiro parenteses der sempre falso então ira aparecer
	não entrou no if se 1 dos 2 dentro do parenteses for verdadeiro entao dara entrou no if, pois a operacao é:
	|ou e &e*/
		if (true &(false | false)){
			System.out.println("entrou no if");
		}else{
			System.out.println("Não entrou no if");
		}
	}
}
