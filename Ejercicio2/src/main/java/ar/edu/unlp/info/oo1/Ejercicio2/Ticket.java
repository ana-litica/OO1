package ar.edu.unlp.info.oo1.Ejercicio2;
import java.time.*;
public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal, precioTotal;
	
	public Ticket(LocalDate fecha, int cantidadProductos,double peso,double precio) {
		this.fecha=fecha;
		this.cantidadDeProductos=cantidadProductos;
		this.pesoTotal=peso;
		this.precioTotal=precio;
	}
	
	public double impuesto() {
		return this.precioTotal*0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
}
