package CompaniaAerea;

import java.util.List;

public class CompaniaAerea {

	private List<Boing> boings;
	private List<Monomotor> monomotores;
	private List<Bimotor> bimotores;
	
	public double Fatura(){
		this.getBoing();
		return 0;	
	}
	public List<Boing> getBoing() {
		return boings;
	}
	public void setBoing(List<Boing> boings) {
		this.boings =  boings;
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
