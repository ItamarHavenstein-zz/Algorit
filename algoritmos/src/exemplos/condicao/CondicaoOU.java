package exemplos.condicao;

public class CondicaoOU {
	
	public static void main(String[] args) {
		int a = 5;
		if (++a > 5 || ++a > 6){// esse funciona como OU curto circuito, se ele acha o valor ja na primeira condi��o ele n�o continua
			a++;
			System.out.println("a= " +a);
		}
	int b = 5;
	if (++b > 5 | ++b > 6){// funciona como OU tamb�m mas ele faz as opera��es ate o final por isso a resposta final � diferente.
		b++;
		System.out.println("a= " +b);

	}
	}
}
