package ar.edu.unlp.info.oo1.Ejercicio2;
import java.time.*;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal,pesoTotal;
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal+=producto.getPrecio();
		this.pesoTotal+=producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket=new Ticket(LocalDate.now(),this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
		return ticket;
	}
}
