package ar.edu.unlp.info.oo1.ejercicio7_figurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private Cara caraBasal;
	
	public Cuerpo3D() {

	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double valor) {
		this.altura=valor;
	}
	
	public void setCaraBasal(Cara cara) {
		this.caraBasal=cara;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea()*this.getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2*this.caraBasal.getArea()+this.caraBasal.getPerimetro()*this.altura;
	}
}
