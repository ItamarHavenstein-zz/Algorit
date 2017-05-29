package exercicios.CondeInter;
/*17. Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e sua idade. 
 * Pergunte o nome da terceira pessoa e sua idade. Imprima o nome e idade de pessoas mais velha, 
 * do meio e a mais nova, utilizando apenas um Sysout. Sendo considerado a idade uma variável int.*/

import javax.swing.JOptionPane;

public class Item15 {
	
	public static void main(String[] args) {
		String nome_1 = JOptionPane.showInputDialog("Digite seu nome");
		int idade_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		String nome_2 = JOptionPane.showInputDialog("Digite outro nome");
		int idade_2 = Integer.parseInt(JOptionPane.showInputDialog("DIgite a idade"));
		String nome_3 = JOptionPane.showInputDialog("Digite outro nome");
		int idade_3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		int maior_1=0;
		int maior_2=0;
		int menor_1=0;
		int menor_2=0;
		int b=0;
		
		if(idade_1>idade_2){
			maior_1 = idade_1;
			menor_1 = idade_2;
		}else{
			maior_1 = idade_2;
			menor_1 = idade_1;
		}
		if(maior_1>idade_3){
			maior_2 = maior_1;
			menor_2 = idade_3;
		}else{
			maior_2 = idade_3;
			menor_2 = maior_1;
		}
		if(menor_1> menor_2){
			b = menor_1;
		}else{
			b = menor_2;
		}
		int a = maior_2;
		String maisvelho=null;
		if(a == idade_1 && b == idade_2){
			maisvelho = "Pessoa de maior idade "+nome_1+" "+idade_1+". Segunda pessoal "+nome_2+" "+idade_2+". Terceira pessoa "+nome_3+" "+idade_3;
		}else{
			if(a == idade_1 && b == idade_3){
				maisvelho = "Pessoa de maior idade "+nome_1+" "+idade_1+". Segunda pessoal "+nome_3+" "+idade_3+". Terceira pessoa "+nome_2+" "+idade_2;
			}else{
				if(a == idade_2 && b == idade_1){
					maisvelho = "Pessoa de maior idade "+nome_2+" "+idade_2+". Segunda pessoal "+nome_1+" "+idade_1+". Terceira pessoa "+nome_3+" "+idade_3;
				}else{
					if(a == idade_2 && b == idade_3){
						maisvelho = "Pessoa de maior idade "+nome_2+" "+idade_2+". Segunda pessoal "+nome_3+" "+idade_3+". Terceira pessoa "+nome_1+" "+idade_1;
					}else{
						if(a == idade_3 && b == idade_1){
							maisvelho = "Pessoa de maior idade "+nome_3+" "+idade_3+". Segunda pessoal "+nome_1+" "+idade_1+". Terceira pessoa "+nome_2+" "+idade_2;
						}else{
							if(a == idade_3 && b == idade_2){
								maisvelho = "Pessoa de maior idade "+nome_3+" "+idade_3+". Segunda pessoal "+nome_2+" "+idade_2+". Terceira pessoa "+nome_1+" "+idade_1;
							}
						}
					}
				}
			}
			
		}
		
		System.out.println(maisvelho);
	}
}
