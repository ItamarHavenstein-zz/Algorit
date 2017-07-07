package JavaHeranca;

public class Secretarias extends Funcionarios {

	private String ramal;

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	@Override
	public String info() {
		return super.info() + "\nRamal: " + ramal;
	}
}
