package Conhecimento;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas {
	
	public static void main(String[] args) throws ParseException  {
		//CALENDAR
		
				Calendar c = Calendar.getInstance();
				System.out.println("Data e Hora atual: " + c.getTime());// mostra dia
																		// mes hora ano

				System.out.println("Data/Hora atual: " + c.getTime());
				System.out.println("Ano: " + c.get(Calendar.YEAR));// mostra o ano
				System.out.println("M�s: " + c.get(Calendar.MONTH));// mostra o mes janeiro = 0 e dezembro = 11
				System.out.println("Dia do M�s: " + c.get(Calendar.DAY_OF_MONTH));// mostra dia do mes
																					 
				// neste caso configuramos o ano,o mes e o dia
				c.set(Calendar.YEAR, 1995);
				c.set(Calendar.MONTH, Calendar.MARCH);
				c.set(Calendar.DAY_OF_MONTH, 20);

				// quando formos imprimir mostrara o que ja programamos anteriormente e
				// a hora atual
				System.out.println("Data/Hora atual: " + c.getTime());
				System.out.println("Ano: " + c.get(Calendar.YEAR));
				System.out.println("M�s: " + c.get(Calendar.MONTH));
				System.out.println("Dia do M�s: " + c.get(Calendar.DAY_OF_MONTH));

				//mostra uma sauda��o feita com a hora que o usuario se conectou com o sistema 
				Calendar c1 = Calendar.getInstance();
				int hora = c1.get(Calendar.HOUR_OF_DAY);

				if (hora > 6 && hora < 12) {
					System.out.println("Bom Dia");//no caso se for entre 6 e 12 horas dar� um bom dia
				} else if (hora > 12 && hora < 18) {
					System.out.println("Boa Tarde");//se for entre 12 e 18 horas dar� uma boa tarde
				} else {
					System.out.println("Boa Noite");// caso contrario dar� uma boa noite
				}

				//DATEFORMAT
				
				Calendar c2 = Calendar.getInstance();
				c2.set(2013, Calendar.FEBRUARY, 28);
				Date data = c2.getTime();
				System.out.println("Data atual sem formata��o: "+data);//data sem fomata��o
				
				//Formata a data
				DateFormat formataData = DateFormat.getDateInstance();
				System.out.println("Data atual com formata��o: "+ formataData.format(data));//data com formata��o
				
				//Formata Hora
		        DateFormat hora1 = DateFormat.getTimeInstance();
				System.out.println("Hora formatada: "+hora1.format(data));///hora formatada

				//Formata Data e Hora
				DateFormat dtHora = DateFormat.getDateTimeInstance();
				System.out.println(dtHora.format(data));
				
				//formata��es de datas 
				Calendar c3 = Calendar.getInstance();
				Date data1 = c3.getTime();
				
				DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
				System.out.println("Data brasileira: "+f.format(data1));

		        f = DateFormat.getDateInstance(DateFormat.LONG);
				System.out.println("Data sem o dia descrito: "+f.format(data1));
				
				f = DateFormat.getDateInstance(DateFormat.MEDIUM);
				System.out.println("Data resumida 1: "+f.format(data1));
				
				f = DateFormat.getDateInstance(DateFormat.SHORT);
				System.out.println("Data resumida 2: "+f.format(data1));
				
				//CONVERS�ES DE SIMPLEDATEFORMAT
				
				Calendar c4 = Calendar.getInstance();
				Date data2 = c4.getTime();
				DateFormat f1 = DateFormat.getDateInstance();
				
				Date data3 = f1.parse("12/01/1995");
				System.out.println(data3);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("Data formatada: "+sdf.format(data2));
				
				//Converte Objetos
				System.out.println("Data convertida: "+sdf.parse("02/08/1970"));
				
				//FORMATAR DATA E HORA A PARTIR DE OUTRAS LOCALIZA��ES NO CASO OUTROS PAISES
				
				Calendar c5 = Calendar.getInstance();
				Date data4 = c5.getTime();
				
				Locale brasil = new Locale("pt", "BR"); //Retorna do pa�s e a l�ngua
				Locale eua = Locale.US;
				Locale italia = Locale.ITALIAN;
				
				DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
				System.out.println("Data e hora brasileira: "+f2.format(data4));
				
				DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, eua);
				System.out.println("Data e hora americana: "+f3.format(data4));
				
				DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, italia);
				System.out.println("Data e hora italiana: "+f4.format(data4));
				
				
	}
}
