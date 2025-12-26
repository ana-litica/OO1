package ar.edu.unlp.info.oo1.AlquilerDePropiedades;
import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

public class Propiedad {
	private String direccion, nombreDescriptivo;
	private double precio;
	private List<Reserva> reservas;
	
	public Propiedad(String direccion,String nombre,double precio) {
		this.direccion=direccion;
		this.nombreDescriptivo=nombre;
		this.precio=precio;
		this.reservas=new ArrayList<>();
	}
	
	public List<Reserva> getReservas(){
		return this.reservas;
	}
	
	public double getPrecioPorNoche() {
		return precio;
	}
	
	public void agregarReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public void cancelarReserva(Reserva reserva) {
		reservas.remove(reserva);
	}
	
	public boolean consultarDisponibilidad(DateLapse periodo) {
		return reservas.stream()
				.filter(r->r.getPeriodo().overlaps(periodo)).collect(Collectors.toList()).size()==0;
//		return reservas.stream()
//				.filter(r->r.getPeriodo().overlaps(periodo)).toList().size()==0;
		
	}
	
	private List<Reserva> dentroDelPeriodo(DateLapse periodo){
		return reservas.stream().filter(p->p.dentroDelPeriodo(periodo))
				.collect(Collectors.toList());
	}
	
	public double totalPrecio(DateLapse periodo) {
		return this.dentroDelPeriodo(periodo).stream()
				.mapToDouble(r->r.calcularPrecio())
				.sum();
	}
	
}
