package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private boolean envioRapido;
	
	public EnvioLocal(LocalDate fecha, String origen,String destino, double peso, boolean envioRapido) {
		super(fecha, origen, destino, peso);
		this.envioRapido=envioRapido;
	}
	
	public double calcularMonto() {
		if(envioRapido)
			return 1500;
		return 1000;
	}

}
