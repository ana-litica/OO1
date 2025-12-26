package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.*;

public class TestEnvioInterurbano {
	private Envio menosKm,medioKm,masKm;
	
	@BeforeEach
	void setUp() {
		menosKm=new EnvioInterurbano(LocalDate.now(),"La Plata","Formosa",1000,99);
		medioKm=new EnvioInterurbano(LocalDate.now(),"La Plata","Formosa",1000,100);
		masKm=new EnvioInterurbano(LocalDate.now(),"La Plata","Formosa",1000,501);
	}
	
	@Test 
	void testCalcularMonto() {
		assertEquals(1000*20,menosKm.calcularMonto());
		assertEquals(1000*25,medioKm.calcularMonto());
		assertEquals(1000*30,masKm.calcularMonto());
	}
}
