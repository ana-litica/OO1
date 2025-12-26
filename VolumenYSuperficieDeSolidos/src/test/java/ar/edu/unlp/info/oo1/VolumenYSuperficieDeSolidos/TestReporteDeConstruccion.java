package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestReporteDeConstruccion {
	private ReporteDeConstruccion reporte,reporteVacio;
	private Pieza cilindro,esfera,prisma;
	
	@BeforeEach
	void setUp() {
		cilindro=new Cilindro("Madera","Rojo",4,6);
		esfera=new Esfera("Aluminio","Rojo",4);
		prisma=new PrismaRectangular("Madera","Azul",2,6,8);
		
		reporte=new ReporteDeConstruccion();
		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(esfera);
		reporte.agregarPieza(prisma);
		
		reporteVacio=new ReporteDeConstruccion();
	}
	
	@Test
	void testVolumenDeMaterial() {
		assertEquals(reporte.volumenDeMaterial("Madera"),398.0);
		assertEquals(reporteVacio.volumenDeMaterial("Plastico"),0);
	}
	
	@Test 
	void testSuperficieDeMaterial() {
		assertEquals(reporte.superficieDeUnColor("Rojo"),452.0);
		//assertEquals(0,reporteVacio.superficieDeUnColor("Amarillo"));
	}
	
	
}
