package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera(String material,String color,double radio) {
		super(material,color);
		this.radio=radio;
	}
	
	public double calcularVolumen() {
		return Math.round(4.0/3.0*Math.PI*Math.pow(radio, 3));
	}
	
	public double calcularSuperficie() {
		return Math.round(4*Math.PI*Math.pow(radio, 2));
	}
}
