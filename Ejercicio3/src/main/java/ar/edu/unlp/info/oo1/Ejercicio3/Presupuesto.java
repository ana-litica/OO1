package ar.edu.unlp.info.oo1.Ejercicio3;
import java.time.*;
import java.util.*;

public class Presupuesto {
	private String cliente;
	private LocalDate fecha;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.cliente=cliente;
		this.fecha=LocalDate.now();
		this.items=new ArrayList<>();
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		return items.stream().mapToDouble(i->i.costo()).sum();
	}
}
