package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;

public class Cilindro extends Pieza{
	private double radio, altura;
	
	public Cilindro(String material,String color,double radio,double altura) {
		super(material,color);
		this.radio=radio;
		this.altura=altura;
	}
	
	public double calcularVolumen() {
		return Math.round(Math.PI*Math.pow(radio, 2)*altura);
	}
	
	public double calcularSuperficie() {
		return Math.round(2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio,2));
	}
}
