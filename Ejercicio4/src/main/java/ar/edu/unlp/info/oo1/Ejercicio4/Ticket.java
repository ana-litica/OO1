package ar.edu.unlp.info.oo1.Ejercicio4;
import java.time.*;
import java.util.*;
public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal,precioTotal;
	private List<Producto> productos;
	
	public Ticket(LocalDate fecha, int cantidadDeProductos,double peso,double precio,List<Producto> productos) {
		this.fecha=fecha;
		this.productos=productos;
		this.cantidadDeProductos=productos.size();
		this.precioTotal=precio;
		this.pesoTotal=peso;
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

	private void setCantidadDeProductos(int cantidadDeProductos) {
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

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public double impuesto() {
		return this.precioTotal*0.21;
	}
}
