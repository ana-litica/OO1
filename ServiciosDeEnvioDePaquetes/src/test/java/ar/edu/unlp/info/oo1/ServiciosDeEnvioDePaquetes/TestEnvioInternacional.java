package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.*;

public class TestEnvioInternacional {
	private Envio envio1kgRapido,envioMaskgRapido;
	private Envio envio1kgEstandar,envioMaskgEstandar;
	
	@BeforeEach
	void setUp() {
		envio1kgRapido=new EnvioInternacional(LocalDate.now(),"Argentina","Colombia",1000,true);
		envioMaskgRapido=new EnvioInternacional(LocalDate.now(),"Argentina","Colombia",1001,true);
		envio1kgEstandar=new EnvioInternacional(LocalDate.now(),"Argentina","Colombia",1000,false);
		envioMaskgEstandar=new EnvioInternacional(LocalDate.now(),"Argentina","Colombia",1001,false);
	}
	
	@Test 
	void testCalcularMonto() {
		assertEquals(15000+800,envio1kgRapido.calcularMonto());
		assertEquals(5000+12*1001+800,envioMaskgRapido.calcularMonto());
		assertEquals(15000,envio1kgEstandar.calcularMonto());
		assertEquals(5000+12*1001,envioMaskgEstandar.calcularMonto());
	}
	
}
