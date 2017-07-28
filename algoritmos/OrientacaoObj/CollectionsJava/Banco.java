package CollectionsJava;

public class Banco {

	private String numBanco;
	private String tipoBanco;
	
	public Banco(String numBanco, String tipoBanco) {
		super();
		this.numBanco = numBanco;
		this.tipoBanco = tipoBanco;
	}
	public String getNumBanco() {
		return numBanco;
	}
	public void setNumBanco(String numBanco) {
		this.numBanco = numBanco;
	}
	public String getTipoBanco() {
		return tipoBanco;
	}
	public void setTipoBanco(String tipoBanco) {
		this.tipoBanco = tipoBanco;
	}
	
}
