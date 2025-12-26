package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;
import java.util.*;
import java.util.stream.Collectors;

public abstract class Cliente {
	private String nombre,direccion;
	private List<Envio> envios;
	
	public Cliente(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.envios=new ArrayList<>();
	}
	
	public void agregarEnvio(Envio envio) {
		envios.add(envio);
	}
	
	private List<Envio> filtrarPorFecha(DateLapse periodo){
		return envios.stream()
				.filter(e->periodo.includesDate(e.getFechaDeDespacho()))
				.collect(Collectors.toList());
	}
	
	public double calcularMontoAPagar(DateLapse periodo) {
		return this.filtrarPorFecha(periodo).stream()
				.mapToDouble(e->e.calcularMonto()).sum();
	}

}
