package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCilindro {
	private Cilindro cilindro;
	
	@BeforeEach
	void setUp() {
		cilindro=new Cilindro("Madera","Rojo",4,6);
	}
	
	@Test 
	void testCalcularVolumen () {
		assertEquals(302,cilindro.calcularVolumen());
	}
	
	@Test
	void testCalcularSuperficie() {
		assertEquals(251,cilindro.calcularSuperficie());
	}
}
