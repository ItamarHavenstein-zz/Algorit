package exemplos.laco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Scanner;

public class Data {

		public static void main(String[] args) throws ParseException {
			Scanner scanner = new Scanner(System.in);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			
			System.out.println("Digite o seu nome:");
			String nome = scanner.nextLine();
			
			System.out.println("Digite a sua data de nascimento no formato (dd/mm/yyyy):");
			Date data = sdf.parse(scanner.nextLine());
			
			System.out.println("Digite o seu telefone:");
			String telefone = scanner.nextLine();
			
			System.out.println("Digite a cidade de nascimento:");
			String cidade = scanner.nextLine();
			
			//Realiza o cálculo da idade
			LocalDate dataAtual = LocalDate.now();
		    LocalDate dataNascimento = LocalDateTime.ofInstant(data.toInstant(), ZoneOffset.UTC).toLocalDate();
			Period periodo = Period.between(dataNascimento, dataAtual);
		    int idade = periodo.getYears();
			
			System.out.println("Meu nome é "+nome+", nasci no dia "+sdf.format(data)+", tenho "+idade
					+" anos.\n Se você quiser entrar em contato comigo, pode ligar para o telefone "+telefone
					+".\n Há esqueci de te dizer aonde eu nasci, foi na cidade de "+cidade);
			
			scanner.close();
		}
	}

