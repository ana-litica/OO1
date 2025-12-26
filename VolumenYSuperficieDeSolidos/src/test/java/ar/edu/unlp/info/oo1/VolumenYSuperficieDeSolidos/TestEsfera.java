package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestEsfera {
	private Esfera esfera;
	
	@BeforeEach
	void setUp() {
		esfera=new Esfera("Aluminio","Naranja",4);
	}
	
	@Test
	void testCalcularVolumen() {
		assertEquals(268,esfera.calcularVolumen());
	}
	
	@Test
	void testCalcularSuperficie() {
		assertEquals(201,esfera.calcularSuperficie());
	}
}
