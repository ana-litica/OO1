package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.*;

public class TestEnvioLocal {
	private Envio entregaEstandar,entregaRapida;
	
	@BeforeEach
	void setUp() {
		entregaEstandar=new EnvioLocal(LocalDate.now(),"333 333","444 444",1000,false);
		entregaRapida=new EnvioLocal(LocalDate.now(),"333 333","444 444",1000,true);
	}
	
	@Test 
	void testCalcularMonto() {
		assertEquals(1000,entregaEstandar.calcularMonto());
		assertEquals(1500,entregaRapida.calcularMonto());
	}
}
