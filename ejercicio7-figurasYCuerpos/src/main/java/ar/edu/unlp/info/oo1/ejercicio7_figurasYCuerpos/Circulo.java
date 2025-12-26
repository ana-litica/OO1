package ar.edu.unlp.info.oo1.ejercicio7_figurasYCuerpos;

public class Circulo implements Cara{
	private double radio;
	
	public Circulo() {
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getDiametro() {
		return this.radio*2;
	}
	
	public void setDiametro(double diametro) {
		this.radio=diametro/2;
	}
	
	public double getArea() {
		return Math.PI*this.radio*this.radio;
	}
	
	public double getPerimetro() {
		return Math.PI*this.getDiametro();
	}
}
