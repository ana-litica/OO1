package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;
import java.time.*;

public abstract class Envio {
	private LocalDate fechaDeDespacho;
	private String origen, destino;
	private double peso;
	
	public Envio(LocalDate fecha, String origen,String destino, double peso) {
		this.fechaDeDespacho=fecha;
		this.origen=origen;
		this.destino=destino;
		this.peso=peso;
	}
	
	public LocalDate getFechaDeDespacho() {
		return this.fechaDeDespacho;
	}
	
	public String getOrigen() {
		return this.origen;
	}
	
	public String getDestino() {
		return this.destino;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public abstract double calcularMonto();
	
}
