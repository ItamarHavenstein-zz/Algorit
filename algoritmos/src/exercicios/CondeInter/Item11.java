package exercicios.CondeInter;
/*13. Escreva um algoritmo que o usuário entre com o salário da pessoa e
 imprima o salário líquido,
 *  segundo as informações abaixo, utilizando apenas um System.out.println:
a. Menor ou igual a R$ 600,00 é isento
b. Maior que R$ 600 e menor ou igual a R$ 1.200,00 o desconto é de 20%
c. Maior que R$ 1.200,00 e menor ou igual a R$ 2000,00 o desconto é 25%
d. Maior que R$ 2000,00 o desconto é 30%
Sendo que o salário líquido é igual ao salário bruno menos os descontos.*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Item11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double salario;
		System.out.println("Digite seu salário");
		salario = scanner.nextDouble();
		
		if(salario<=600){
			JOptionPane.showMessageDialog(null, "Isento");
		}else{
			if(salario> 600 && salario <=1200){
				JOptionPane.showMessageDialog(null, "Seu salário após o desconto será: "+(salario -(salario*20)/100));
		}else{
			if(salario>1200 && salario <=2000){
				JOptionPane.showMessageDialog(null,"Seu salário após o desconto será: "+(salario -(salario*25)/100));
		}else{
			if(salario>2000){
				JOptionPane.showMessageDialog(null, "Seu salário após o desconto será: "+(salario -(salario*30)/100));
			}
		}
		}
		}
		scanner.close();
		
	}
}
