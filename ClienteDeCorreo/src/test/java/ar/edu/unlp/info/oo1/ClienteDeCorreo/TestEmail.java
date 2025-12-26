package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestEmail {
	private Email mail, mailVacio;
	private Archivo hola,chau;
	
	@BeforeEach
	void setUp() {
		mail=new Email("Hola","Cómo estás?");
		hola=new Archivo("Hola");
		chau=new Archivo("Chau");
		mail.agregarArchivo(hola);
		mail.agregarArchivo(chau);
		
		mailVacio=new Email("","");
		
	}
	
	@Test
	void testEspacioMail() {
		assertEquals(23,mail.espacioMail());
		assertEquals(0,mailVacio.espacioMail());
	}
	
	@Test //preguntar
	void testContieneTexto() {
		assertNotNull(mail.contieneTexto("?"));
		assertNull(mailVacio.contieneTexto("Hola"));
	}
}
