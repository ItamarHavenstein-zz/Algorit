package Exercicio.ArrayMatriz;
/*19. Criar um array com os valores 1, 2, 3, 4, 5. Criar outro array com os valores 5, 4, 3, 2, 1.
 Utilizando for, imprimir em qual é as posições dos arrays que o valor é são iguais, conforme exemplo abaixo:
	arrayA posição 0, arrayB posição 4 possuem o valor 1
arrayA posição 1, arrayB posição 3 possuem o valor 2*/
public class Item19 {
public static void main(String[] args) {
	int [] cresc = new int[5];
	int [] descr = new int[5];
	for(int a = 0;a<cresc.length;a++){
		cresc[a]=a+1;
	}
	int b = 0;
	for(int c = 5; c>0;c--){
		descr[b]=c;
		b++;
	}
	for(int d=0;d<5;d++){
		System.out.println(cresc[d]+" "+descr[d]);
	}
	for(int e = 0;e<4;e++){
		for(int f = 4;f>0;f--){
			if((cresc[e]==1)&&(descr[f]==1)){
				
				System.out.println("\nArray cresc "+cresc+" e o array descr "+descr+" tem valor 1");
			}
		}
	}
}
}
