package exercicios.CondeInter;
/*9. Mariazinha quer sair com amigas no domingo a tarde no shopping. 
Só que ela não sabe que roupa ela vai usar ainda, por que ela não viu o jornal do clima na tv.
 Desta na hora de sair ela vai olhar para fora da janela e ver o tempo para verificar qual roupa ela usará. 
 Contudo a Mariazinha já nos disse o que ela usará em cada clima e temperatura. Desta forma, 
 escreva um algoritmo que verifique as condições do tempo (clima e temperatura) e 
 imprima no console qual a roupa que a Mariazinha escolheu para usar.
a. Se estiver sol ela usuário blusa
b. Se estiver sol e a temperatura estiver acima de 30° ela usará saia
c. Se estiver sol e a temperatura estiver abaixo ou igual a 30° e maior ou igual a 23° ela usará shorts.
d. Se estiver sol e a temperatura estiver abaixo de 23ª graus ela usuário calça jeans.
e. Se estiver nublado e a temperatura estiver mais que 25° graus ela usará vestido.
f. Se estiver nublado e a temperatura estiver menor ou igual a 25° ela usará calça de moletom e sobretudo. 
g. Se estiver chovendo ela usará bota e calça  jean
h. Se estiver chovendo e a temperatura for menor ou igual a 10° ela usará blusa e um casaco de lã.
i. Se estiver chovendo e a temperatura for maior que 10° e menor que 25° ela usará camisete. 
j. Se estiver chovendo e a temperatura for maior ou igual a 25° ela usará uma blusa regata
k. Caso contrário ela vai ficar em casa*/

import javax.swing.JOptionPane;

public class Item7_1 {

	public static void main(String[] args) {
		String clima = JOptionPane.showInputDialog("Digite como está o clima(sol,Nublado,chovendo)");
		int temp = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura"));
		
			if(clima.equals("sol")&& temp >30){
				JOptionPane.showMessageDialog(null, "Mariazinha usará  Blusa e Saia");
			}else{
				if(clima.equals("sol")&& temp <= 30 && temp >= 23){
					JOptionPane.showMessageDialog(null, "Mariazinha usará Blusa e Shorts");
				}else{
					if(clima.equals("sol")&& temp >23){
						JOptionPane.showMessageDialog(null, "Mariazinha usará Blusa e Calça Jeans");
					}else{
						if(clima.equals("nublado")&& temp >25){
							JOptionPane.showMessageDialog(null,"Mariazinha usará Vestido");
						}else{
							if(clima.equals("nublado")&& temp <=25){
								JOptionPane.showMessageDialog(null, "Mariazinha usará Moleton e Sobretudo");
							}else{
								if(clima.equals("chovendo")&& temp <= 10){
										JOptionPane.showMessageDialog(null,"Mariazinha usará Blusa um Casaco de Lã e Calca Jeans com Bota");
									}else{
										if(clima.equals("chovendo")&& temp>10 && temp<25){
											JOptionPane.showMessageDialog(null,"Mariazinha usará Camisete e Calça Jeans com Bota");
										}else{
											if(clima.equals("chovendo")&& temp >=25){
												JOptionPane.showMessageDialog(null, "Mariazinha usará Blusa Regata e Calça Jeans com Bota");
											}else{
												JOptionPane.showMessageDialog(null, "Hoje vou ficar em casa");
											}
										}
									}
								}
							}
						}
					}
				}
			}
	}
