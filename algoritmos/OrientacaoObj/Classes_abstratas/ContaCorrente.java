package Classes_abstratas;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Contas {
	DecimalFormat df = new DecimalFormat();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
	
	private double saldo;
	private double limite;
	private double encargos;
	
	public ContaCorrente(String nome, String numConta, double salconta, double limconta, double encargos){
		this.setNome(nome);
		this.setNumeroConta(numConta);
		this.setSaldo(salconta);
		this.setLimite(limconta);
		this.setEncargos(encargos);
	}
	public ContaCorrente(){		
	}
	//um construtor abstratto criado na classe contas.
	@Override
	public void imprimiExtratoDetalhado() {
		System.out.println("Extrato de Conta Corrente");
		Date agora = new Date();
		System.out.println("Data "+sdf.format(agora));
		System.out.println("Nome: "+this.getNome());		
		System.out.println("Saldo: "+df.format(this.getSaldo()));
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getEncargos() {
		return encargos;
	}
	public void setEncargos(double encargos) {
		this.encargos = encargos;
	}

}
