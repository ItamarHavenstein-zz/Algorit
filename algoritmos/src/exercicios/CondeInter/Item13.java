package exercicios.CondeInter;
/*15. Pergunte para o usuário um dia do mês e número do mês. 
 * Faça um algoritmo que valide se o dia e o mês existem no calendário, utilizando apenas um Sysout. 
 * Sendo considerado duas variáveis int um para dia e outra para mês.
 * 1-31
 * 2-28
 * 3-31
 * 4-30
 * 5-31
 * 6-30
 * 7-31
 * 8-31
 * 9-30
 * 10-31
 * 11-30
 * 12-31
 */

import javax.swing.JOptionPane;

public class Item13 {
	
	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia do mês"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero do mês"));
		
		boolean condicao;
		String valid;;
		if(dia <=31 && (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)){
			condicao = true;
		}else{
			if(dia <=30&&(mes==4||mes==6||mes==9||mes==11)){
				condicao = true;
			}else{
				if(dia<=29&& mes ==2){
					condicao = true;
				}else{
					condicao = false;
				}
			}
		}
		if(condicao == true){
			 valid = "Isso Existe";
		}else{
			valid ="Isso Não Existe";
		}
		System.out.println(valid);
	}
}
