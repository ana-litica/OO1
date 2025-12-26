package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;

public class ClienteCorporativo extends Cliente{
	private int CUIT;
	
	public ClienteCorporativo(String nombre, String direccion,int CUIT) {
		super(nombre, direccion);
		this.CUIT=CUIT;
	}
	//descuento return 0
}
