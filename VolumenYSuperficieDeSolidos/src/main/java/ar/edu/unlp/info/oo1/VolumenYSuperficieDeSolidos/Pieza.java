package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;

public abstract class Pieza {
	private String material,color;
	
	public Pieza(String material,String color) {
		this.material=material;
		this.color=color;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return color;
	}
	
	public abstract double calcularVolumen();
	
	public abstract double calcularSuperficie();
}
