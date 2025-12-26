package ar.edu.unlp.info.oo1.AlquilerDePropiedades;
import java.util.*;
import java.time.*;

public class Usuario {
	private String nombre, direccion;
	private int DNI;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre,String direccion, int DNI) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.DNI=DNI;
		propiedades=new ArrayList<>();
	}
	
	public void agregarPropiedad(Propiedad prop) {
		propiedades.add(prop);
	}
	
	public void sacarPropiedad(Propiedad prop) {
		propiedades.remove(prop);
	}
	
	public void crearReserva(Propiedad prop, DateLapse periodo) {
		Reserva nuevaReserva=new Reserva(periodo,prop);
		prop.agregarReserva(nuevaReserva);
	}
	
	public void cancelarReserva(Reserva reserva) {
		if(!reserva.getPeriodo().includesDate(LocalDate.now())) {
			reserva.getPropiedad().cancelarReserva(reserva);
		}
	}
	
	public double calcularIngresos(DateLapse periodo) {
		return (propiedades.stream().mapToDouble(p->p.totalPrecio(periodo)).sum())*0.75;
	}
}
