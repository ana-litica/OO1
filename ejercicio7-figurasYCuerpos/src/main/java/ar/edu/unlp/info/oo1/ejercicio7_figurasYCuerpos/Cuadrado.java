package ar.edu.unlp.info.oo1.ejercicio7_figurasYCuerpos;

public class Cuadrado implements Cara{
	private double lado;
	
	public Cuadrado() {
	}
	
	public void setLado(double lado) {
		this.lado=lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getArea() {
		return this.lado*this.lado;
	}
	
	public double getPerimetro() {
		return this.lado*4;
	}
	
	
}
