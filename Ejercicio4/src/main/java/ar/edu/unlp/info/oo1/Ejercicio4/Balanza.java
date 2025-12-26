package ar.edu.unlp.info.oo1.Ejercicio4;
import java.time.LocalDate;
import java.util.*;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal,pesoTotal;
	private List<Producto> productos;
	
	public Balanza() {
		this.productos=new ArrayList<Producto>();
		ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.productos.clear();
		this.cantidadDeProductos=productos.size();
		this.precioTotal=0;
		this.pesoTotal=0;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		return productos.stream().mapToDouble(p->p.getPrecio()).sum();
	}

	public double getPesoTotal() {
		return productos.stream().mapToDouble(p->p.getPeso()).sum();
	}

	public List<Producto> getProductos() {
		return productos;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket=new Ticket(LocalDate.now(),productos.size(),this.getPesoTotal(),this.getPrecioTotal(),productos);
		return ticket;
	}
}
