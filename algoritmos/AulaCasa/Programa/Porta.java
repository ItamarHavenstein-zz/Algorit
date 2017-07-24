package Programa;
//: aberta, cor, dimensaoX, dimensaoY, dimensaoZ 
//Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta() 
public class Porta {

	private String posicao;
	private String cor;
	private double dimenX;
	private double dimenY;
	private double dimenZ;
	
	public void abre(){
		this.posicao = "Aberta";
	}
	public void fecha(){
		this.posicao = "Fechada";
	}
	public void cor(String cor){
		this.cor = cor;
	}
	public boolean estaAberta(){
		boolean result = false;
		if(this.posicao == "Aberta"){
			result = true;
		}
		return  result;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getDimenX() {
		return dimenX;
	}
	public void setDimenX(double dimenX) {
		this.dimenX = dimenX;
	}
	public double getDimenY() {
		return dimenY;
	}
	public void setDimenY(double dimenY) {
		this.dimenY = dimenY;
	}
	public double getDimenZ() {
		return dimenZ;
	}
	public void setDimenZ(double dimenZ) {
		this.dimenZ = dimenZ;
	}
	
	
}
