package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;

public class PersonaFisica extends Cliente{
	private int DNI;
	
	public PersonaFisica(String nombre, String direccion,int DNI) {
		super(nombre,direccion);
		this.DNI=DNI;
	}
	
	private double descuento(double monto) {
		return monto*0.1;
	}

	@Override
	public double calcularMontoAPagar(DateLapse periodo) {
		double monto=super.calcularMontoAPagar(periodo);
		return monto-descuento(monto);
	}
}
