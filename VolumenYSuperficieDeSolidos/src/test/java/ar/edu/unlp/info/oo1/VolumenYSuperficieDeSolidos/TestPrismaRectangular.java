package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestPrismaRectangular {
	private PrismaRectangular prisma;
	
	@BeforeEach
	void setUp() {
		prisma=new PrismaRectangular("Plastico","Azul",2,6,8);
	}
	
	@Test
	void testCalcularVolumen() {
		assertEquals(96,prisma.calcularVolumen());
	}
	
	@Test 
	void testCalcularSuperficie() {
		assertEquals(152,prisma.calcularSuperficie());
	}
}
