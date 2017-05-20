package exercicios.OptionPane;
/*17) Imprimir uma lista semelhante a lista abaixo:
1_10
2_9
3_8
4_7
5_6
6_5
7_4
8_3
9_2
10_1*/



public class item17 {
	
	public static void main(String[] args) {
		int b =11;
		for(int a =0; a <=10; a++)  {
			if(b>=0)b--;
				System.out.println(+a+ "_"+b);
			}
		}
	}

