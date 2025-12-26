package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;

public class PrismaRectangular extends Pieza{
	private double ladoMenor,ladoMayor,altura;
	
	public PrismaRectangular(String material,String color,double ladoMenor,double ladoMayor,double altura) {
		super(material,color);
		this.ladoMayor=ladoMayor;
		this.ladoMenor=ladoMenor;
		this.altura=altura;
	}
	
	public double calcularVolumen() {
		return this.ladoMayor*this.ladoMenor*this.altura;
	}
	
	public double calcularSuperficie() {
		return 2*(ladoMayor*ladoMenor+ladoMayor*altura+ladoMenor*altura);
	}
}
