package Exercicio.ArrayMatriz;
/*27. Conforme os moldes do exercício 31 e 32 seguindo os mesmos padrões, 
 * só que agora somar os valores conforme exemplos abaixo:
a. 3 2 3
   2 2 3
   1 1 2

Soma dos número ímpares da linha 0: 6
Soma dos números pares da linha 0: 2
Soma dos número ímpares da linha 1: 3
Soma dos números pares da linha 1: 4
Soma dos número ímpares da linha 2: 2
Soma dos números pares da linha 2: 2*/
public class Item27 {
public static void main(String[] args) {
	int[] col1 = new int[3];
	int[] col2 = new int[3];
	int[] col3 = new int[3];
	col1 [0]=3;
	col1 [1]=2;
	col1 [2]=1;
	col2 [0]=2;
	col2 [1]=2;
	col2 [2]=1;
	col3 [0]=3;
	col3 [1]=3;
	col3 [2]=2;
	int impar = 0;
	int impar1= 0;
	int impar2= 0;
	for(int aux=0;aux<col1.length;aux++){
		if((col1[aux]==col1[0]) &&(col1[0]%2==1)){
			impar =col1[0];			
		}else{
			if((col2[aux]==col2[0]) &&(col2[0]%2==1)){
				impar1 =col2[0];				
			}else{
				if((col3[aux]==col3[0]) &&(col3[0]%2==1)){
					impar2 =col3[0];					
				}
				}
		}}
	System.out.println("Soma dos número ímpares da linha 0: "+(impar+impar1+impar2)+"\n");
	int par = 0;
	int par1= 0;
	int par2= 0;
	for(int aux=0;aux<col1.length;aux++){
		if((col1[aux]==col1[0]) &&(col1[0]%2==0)){
			par =col1[0];			
		}else{
			if((col2[aux]==col2[0]) &&(col2[0]%2==0)){
				par1 =col2[0];				
			}else{
				if((col3[aux]==col3[0]) &&(col3[0]%2==0)){
					par2 =col3[0];					
				}
				}
		}}
	System.out.println("Soma dos números pares da linha 0: "+(par+par1+par2)+"\n");
	int impar3 = 0;
	int impar4= 0;
	int impar5= 0;
	for(int aux=0;aux<col1.length;aux++){
		if((col1[aux]==col1[1]) &&(col1[1]%2==1)){
			impar3 =col1[1];			
		}else{
			if((col2[aux]==col2[1]) &&(col2[1]%2==1)){
				impar4 =col2[1];				
			}else{
				if((col3[aux]==col3[1]) &&(col3[1]%2==1)){
					impar5 =col3[1];					
				}
				}
		}}
	System.out.println("Soma dos número ímpares da linha 1: "+(impar3+impar4+impar5)+"\n");
	int par3 = 0;
	int par4= 0;
	int par5= 0;
	for(int aux=0;aux<col1.length;aux++){
		if((col1[aux]==col1[1]) &&(col1[1]%2==0)){
			par3 =col1[1];			
		}else{
			if((col2[aux]==col2[1]) &&(col2[1]%2==0)){
				par4 =col2[1];				
			}else{
				if((col3[aux]==col3[1]) &&(col3[1]%2==0)){
					par5 =col3[1];					
				}
				}
		}}
	System.out.println("Soma dos números pares da linha 1: "+(par3+par4+par5)+"\n");
	int impar6 = 0;
	int impar7 = 0;
	int impar8 = 0;
	for(int aux=0;aux<col2.length;aux++){
		if((col1[aux]==col1[2]) &&(col1[2]%2==1)){
			impar6 =col1[2];			
		}else{
			if((col2[aux]==col2[2]) &&(col2[2]%2==1)){
				impar7 =col2[2];				
			}else{
				if((col3[aux]==col3[2]) &&(col3[2]%2==1)){
					impar8 =col3[2];					
				}
				}
		}}
	System.out.println("Soma dos número ímpares da linha 2: "+impar6+impar7+impar8+"\n");
	int par6 = 0;
	int par7= 0;
	int par8= 0;
	for(int aux=0;aux<col1.length;aux++){
		if((col1[aux]==col1[2]) &&(col1[2]%2==0)){
			par6 =col1[2];			
		}else{
			if((col2[aux]==col2[2]) &&(col2[2]%2==0)){
				par7 =col2[2];				
			}else{
				if((col3[aux]==col3[2]) &&(col3[2]%2==0)){
					par8 =col3[2];					
				}
				}
		}}
	System.out.println("Soma dos números pares da linha 2: "+(par6+par7+par8)+"\n");

}
}
