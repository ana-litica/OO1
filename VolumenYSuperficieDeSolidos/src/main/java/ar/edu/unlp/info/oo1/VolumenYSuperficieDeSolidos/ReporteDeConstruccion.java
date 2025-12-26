package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;
import java.util.*;

public class ReporteDeConstruccion {
	private ArrayList<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas=new ArrayList<>();
	}
	
	public void agregarPieza(Pieza nuevaPieza) {
		piezas.add(nuevaPieza);
	}
	
	public double volumenDeMaterial(String nombreDeMaterial) {
		if(piezas.size()==0)
			return 0;
		else
			return piezas.stream().filter(pieza->pieza.getMaterial().equals(nombreDeMaterial))
					.mapToDouble(pie->pie.calcularVolumen())
					.sum();
	}
	
	public double superficieDeUnColor(String unNombreDeColor) {
		return piezas.stream().filter(pieza->pieza.getColor().equals(unNombreDeColor))
				.mapToDouble(pie->pie.calcularSuperficie()).
				sum();
	}
}
