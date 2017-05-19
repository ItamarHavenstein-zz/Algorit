package exercicios.numero5;
/* c. int numeroA = 10;
int numeroB = 20;
if((numeroA + numeroB) >= 30) { 
		System.out.println(â€œA soma Ã© maior que 30â€�);
} else {
	System.out.println(â€œA soma Ã© menor que 30â€�);
}*/

public class itemC {/*será mostrado se a soma for maior ou igual a 30 se as duas variaveis somadas forem maiores ou iguais
e depois será mostrado se é menor do que 30 se a somatória das duas variaveis for menor que 30*/
	
	public static void main(String[] args) {
		int numeroA = 10;
		int numeroB = 10;
		if((numeroA + numeroB) >= 30){
			System.out.println("soma é maior ou igual a 30");
		} else {
			System.out.println("soma é menor que 30");
		}
	}
}
