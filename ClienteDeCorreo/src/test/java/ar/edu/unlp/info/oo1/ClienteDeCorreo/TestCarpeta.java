package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCarpeta {
	private Carpeta carpeta,carpetaVacia;
	private Email mail, otroMail,mailVacio;
	private Archivo hola,chau;
	
	@BeforeEach
	void setUp() {
		carpeta=new Carpeta("Inbox");
		carpetaVacia=new Carpeta("Spam");
		
		otroMail=new Email("Otro","Mas");
		mail=new Email("Hola","Cómo estás?");
		hola=new Archivo("Hola");
		chau=new Archivo("Chau");
		mail.agregarArchivo(hola);
		mail.agregarArchivo(chau);
		mailVacio=new Email("","");
		
		carpeta.recibirMail(mail);
		carpeta.recibirMail(otroMail);
		carpeta.recibirMail(mailVacio);
		
	}
	
	@Test 
	void testTamañoCarpeta() {
		assertEquals(carpeta.tamañoCarpeta(),30);
		assertEquals(carpetaVacia.tamañoCarpeta(),0);
	}
	
	@Test
	void testMover() {
		assertNotNull(carpeta.filtrarPorTexto("Otros"));
		assertEquals(carpetaVacia.filtrarPorTexto("Otro").size(),0);
	}
}
