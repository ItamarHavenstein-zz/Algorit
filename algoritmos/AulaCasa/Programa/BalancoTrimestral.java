package Programa;

import java.text.DecimalFormat;

public class BalancoTrimestral{
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0,000.00");
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		
		int balancoTrimestral = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		System.out.println("gastos realizados no primeiro trimestre "+df.format(balancoTrimestral)+"R$");
		
		double mediaMensal;
		mediaMensal = (gastoJaneiro + gastoFevereiro + gastoMarco)/3;
		
		System.out.println("m�dia mensal �: "+df.format(mediaMensal)+"R$");
		
		//aqui eu fa�o uma compara��o para ver se a idade � maior que 18 anos
		int idade = 15;
		if(idade >= 18){
			System.out.println("\npode entrar");
		}else{
			System.out.println("\nn�o pode entrar");
		}
		
		//neste outro coloco se ele tem mais de 18 anos e � amigo do dono
		boolean amigoDoDono = true;
		if(idade<=18 && amigoDoDono == false){//utilizei uma forma de atribuir um valor false
			System.out.println("\npode entrar");
		}else{
			System.out.println("\nn�o pode entrar");
		}
		
		//neste � a mesma coisa do exercicio anterior 
		if(idade<=18 && !amigoDoDono){//s� que neste utilizei outro artificio para atribuir o valor false para a variavel
			System.out.println("\npode entrar");
		}else{
			System.out.println("\nn�o pode entrar");
		}
		
		//atribui��o dentro de um if, utilizando (=) � s� de atribui��o, mas utilizando(==) � de compara��o
		int mes = 1;
		if(mes == 1){
			System.out.println("Voc� deveria estar de f�rias");
		}
		
		//comando while
		int idade1 = 15;
		while(idade1 < 18){
			System.out.println(idade1);
			idade1 ++;
		}
		int i = 0;
		while(i < 10){
			System.out.println(i);
			i++;
		}
		
		//utilizando o for
		for(int a = 0; a< 10;a++){
			System.out.println(a+" Ol�");
		}
		//parando o la�o pois atribuimos uma condi��o
		int x = 0;
		int y = 1000;
		for(int c=x;i<y;c++){
			if(c%19==0){
				System.out.println("achei um numero divisivel por 19 entre x e y");
				break;
			}
		}
		for(int b =0;b<100;b++){
			if(b>50 && b<60){
				System.out.println(b);
				continue;
			}
		}
	}}


