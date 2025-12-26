package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{
	private double distancia;
	
	public EnvioInterurbano(LocalDate fecha, String origen,String destino, double peso,double distancia) {
		super(fecha,origen, destino,peso);
		this.distancia=distancia;
	}
	
	public double calcularMonto() {
		if(distancia<100)
			return this.getPeso()*20;
		if(distancia>= 100 && distancia<=500)
			return this.getPeso()*25;
		return this.getPeso()*30;
	}
}
