package ar.edu.unlp.info.oo1.AlquilerDePropiedades;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	
	public Reserva (DateLapse periodo,Propiedad prop) {
		this.periodo=periodo;
		this.propiedad=prop;
	}
	
	public DateLapse getPeriodo() {
		return periodo;
	}
	
	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public double calcularPrecio() {
		return propiedad.getPrecioPorNoche()*periodo.sizeInDays();
	}
	
	public boolean dentroDelPeriodo(DateLapse periodo) {
		if(periodo.includesDate(this.periodo.getFrom()) || periodo.includesDate(this.periodo.getTo()))
			return true;
		return false;
	}
}
