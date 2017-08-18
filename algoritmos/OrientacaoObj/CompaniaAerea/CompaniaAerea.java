package CompaniaAerea;

import java.text.DecimalFormat;
import java.util.List;

public class CompaniaAerea {
	DecimalFormat df = new DecimalFormat("#,##0.00R$");

	private List<Boing> boings;
	private List<Monomotor> monomotores;
	private List<Bimotor> bimotores;

	
	public double Faturamento(){
		double faturamento = 0d;
		for (Boing boing : getBoing()) {//este é o comando foreach, que esta sendo utilizado
			faturamento += boing.getPassagens() * boing.getLugares();
		}
		for (Monomotor monomotor : getMonomotor()) {
			faturamento += monomotor.getPassagens() * monomotor.getLugares();
		}
		for (Bimotor bimotor : getBimotor()) {
			faturamento += bimotor.getPassagens() * bimotor.getLugares();
		}
		return faturamento;
	}

	public double Fatura(){
		double faturamento = 0d;
		
		for (Boing boing : getBoing()) {
			faturamento += boing.getPassagens() * boing.getLugares();
		}
		for (Monomotor monomotor : getMonomotor()) {
			faturamento += monomotor.getPassagens() * monomotor.getLugares();
		}
		for (Bimotor bimotor : getBimotor()) {
			faturamento += bimotor.getPassagens() * bimotor.getLugares();
		}
		return faturamento;
	}
	public List<Boing> getBoing() {
		return boings;
	}

	public void setBoing(List<Boing> boings) {
		this.boings = boings;
	}

	public List<Monomotor> getMonomotor() {
		return monomotores;
	}

	public void setMonomotor(List<Monomotor> monomotor) {
		this.monomotores = monomotor;
	}

	public List<Bimotor> getBimotor() {
		return bimotores;
	}

	public void setBimotor(List<Bimotor> bimotor) {
		this.bimotores = bimotor;
	}

}
