package Programa;



public class Paises {

	private String pais;
	private String capital;
	private double extensao;
	
	
	public Paises(String pais, String capital, double km){
		this.pais = pais;
		this.capital = capital;
		this.extensao = km;
	}
	
	public boolean equals(final Paises  outro){
		 boolean result = false;
		 if((this.getPais() == outro.getPais())&& (this.getCapital() == outro.getCapital())){
			 result = true;
		 }
		 return result;
		
	}

	public String getPais() {
		return pais;
	}

	public String getCapital() {
		return capital;
	}

	public double getExtensao() {
		return extensao;
	}

	
	
}
