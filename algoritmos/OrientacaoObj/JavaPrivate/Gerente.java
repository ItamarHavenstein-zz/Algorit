package JavaPrivate;

public class Gerente {

	private String nomeBoss;
	private double salarioBoss;
	
	public String getNomeBoss() {
		return nomeBoss;
	}
	public void setNomeBoss(String nomeBoss) {
		this.nomeBoss = nomeBoss;
	}
	public double getSalarioBoss() {
		return salarioBoss;
	}
	public void setSalarioBoss(double salarioBoss) {
		this.salarioBoss = salarioBoss;
	}
	//aqui vc tem uma taxa variavel que o usuario define qual será o valor
	public void aumentoBoss (double valor){
		this.salarioBoss = this.salarioBoss * ((valor/100)+1);
	}
	//neste metodo vc terá uma taxa fixa de 10 por cento, 
	public void aumentoBoss(){
		this.aumentoBoss(10);//vc chama o metodo anterior para não haver um overloading(sobrecarga)
	}
}
