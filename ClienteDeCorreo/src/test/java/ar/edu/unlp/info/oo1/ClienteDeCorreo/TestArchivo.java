package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestArchivo {
	private Archivo archivo;
	
	@BeforeEach
	void setUp() {
		archivo=new Archivo("Hola");
	}
	
	@Test
	void testTamaño() {
		assertEquals(4,archivo.tamaño());
	}
}
