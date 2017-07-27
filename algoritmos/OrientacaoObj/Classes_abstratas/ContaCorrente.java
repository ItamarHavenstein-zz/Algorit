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

	public ContaCorrente(String numeroConta, String nome, double saldo, double limite, double encargos) {
		super(numeroConta, nome);
		this.saldo = saldo;
		this.limite = limite;
		this.encargos = encargos;
	}

	// um construtor abstratto criado na classe contas.
	@Override
	public void imprimiExtratoDetalhado() {
		System.out.println("Extrato de Conta Corrente");
		Date agora = new Date();
		System.out.println("Data " + sdf.format(agora));
		System.out.println("Nome: " + this.getNome());
		System.out.println("Saldo: " + df.format(this.getSaldo()));

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
	public void deposita(double valor) {
		if (valor <= 0) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		} else {
			this.saldo += valor;
		}
	}
	public void saca(double valor)throws Exception{
		if(valor <= 0){
			throw new Exception ("O saque precisa ser maior que Zero");
		}else{
			this.saldo -= valor;
		}
	}

}
