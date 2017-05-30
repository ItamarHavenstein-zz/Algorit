package exercicios.CondeInter;
/*27. Pergunte para o usuário o nome completo, se verifique as seguintes situações ("outrTexto".contains("text")):
a. Se ele tiver Pereira no nome, diga para o usuário “Você é da família pereira”
b. Se ele tiver Silva no nome, diga para o usuário “Você é da família Silva”
c. Se ele tiver Souza no nome, diga para o usuário “Você é da família Souza”
d. Se ele não tiver nenhum dos sobrenomes anteriores, dia para o usuário 
“Infelizmente você não tem sobrenome famoso”.*/
import java.util.Scanner;
public class Item25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome completo");
		String nome = scanner.nextLine();
		if(nome.contains("Pereira")){
			System.out.println("Você é da família Pereira");
		}else{
			if(nome.contains("Silva")){
				System.out.println("Você é da família Silva");
			}else{
				if(nome.contains("Souza")){
					System.out.println("Você é da família Souza");
				}else{
					System.out.println("Infelizmente você não tem sobrenome famoso");
				}
			}
		}
		scanner.close();
	}
}
