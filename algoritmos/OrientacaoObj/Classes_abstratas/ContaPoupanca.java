package Classes_abstratas;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Contas{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
	DecimalFormat df = new DecimalFormat();
	
	private double saldoP;
	private double juros;
	
	public ContaPoupanca(String nome, String numconta, double salpou, double jurpou){
		this.setNome(nome);
		this.setNumeroConta(numconta);
		this.setSaldoP(salpou);
		this.setJuros(jurpou);
		
	}
	public ContaPoupanca(){		
	}
	@Override
	public void imprimiExtratoDetalhado() {
		System.out.println("Extrato de Conta Poupança");
		Date agora = new Date();
		System.out.println("Data "+sdf.format(agora));
		System.out.println("Nome: "+this.getNome());
		System.out.println("Saldo: "+df.format(this.getSaldoP()));
		
	}
	public double getSaldoP() {
		return saldoP;
	}
	public void setSaldoP(double saldoP) {
		this.saldoP = saldoP;
	}
	public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		this.juros = juros;
	}
	
}
