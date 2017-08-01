package CompaniaAerea;

import java.text.DecimalFormat;
import java.util.List;

public class CompaniaAerea {
	DecimalFormat df = new DecimalFormat("#,##0.00R$");

	private List<Boing> boings;
	private List<Monomotor> monomotores;
	private List<Bimotor> bimotores;

	public String Fatura() {

		double soma = 0;
		for (int aux = 0; aux < this.boings.size(); aux++) {
			soma += getBoing().iterator().next().getLugares() * getBoing().iterator().next().getPassagens();
		}
		double soma1 = 0;
		for (int aux = 0; aux < this.monomotores.size(); aux++) {
			soma1 += getMonomotor().iterator().next().getLugares() * getMonomotor().iterator().next().getPassagens();
		}
		double soma2 = 0;
		for (int aux = 0; aux < this.bimotores.size(); aux++) {
			soma2 += getBimotor().iterator().next().getLugares() * getBimotor().iterator().next().getPassagens();
		}
		double faturaTotal = soma + soma1 + soma2;
		return df.format(faturaTotal);
	}

	public String FaturaTeste() {
		double soma = 0;
		double soma1 = 0;
		double soma2 = 0;
		double faturaTotal = 0;

		if (boings.size() >= 1) {
			for (int aux = 0; aux < this.boings.size(); aux++) {
				soma += getBoing().iterator().next().getLugares() * getBoing().iterator().next().getPassagens();
			}
		} else {
			if (monomotores.size() >= 1) {
				for (int aux = 0; aux < this.monomotores.size(); aux++) {
					soma1 += getMonomotor().iterator().next().getLugares()
							* getMonomotor().iterator().next().getPassagens();
				}
			} else {
				if (bimotores.size() >= 1) {
					for (int aux = 0; aux < this.bimotores.size(); aux++) {
						soma2 += getBimotor().iterator().next().getLugares()
								* getBimotor().iterator().next().getPassagens();
					}

				}
			}

		}
		faturaTotal = soma + soma1 + soma2;
		return df.format(faturaTotal);
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
