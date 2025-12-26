package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	private boolean envioRapido;
	
	public EnvioInternacional(LocalDate fecha, String origen,String destino, double peso, boolean envioRapido) {
		super(fecha, origen, destino, peso);
		this.envioRapido=envioRapido;
	}
	
	public double calcularMonto() {
		double total=5000;
		if(this.getPeso()<=1000)
			total+=10*this.getPeso();
		else
			total+=12*this.getPeso();
		if(envioRapido)
			total+=800;
		return total;
	}
}
