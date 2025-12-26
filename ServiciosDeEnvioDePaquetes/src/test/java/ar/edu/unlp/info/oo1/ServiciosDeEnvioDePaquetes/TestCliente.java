package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.*;

public class TestCliente {
	private Cliente persona, corporativo;
	private EnvioInternacional envio1kgRapido,envioMaskgRapido,envio1kgEstandar,envioMaskgEstandar;
	private EnvioInterurbano menosKm,medioKm,masKm;
	private EnvioLocal entregaEstandar,entregaRapida;
	private DateLapse periodo;
	
	@BeforeEach
	void setUp() {
		persona=new PersonaFisica("Ana","555 555",43434343);
		corporativo=new ClienteCorporativo("Farmacity","666 666",232323232);
		
		envio1kgRapido=new EnvioInternacional(LocalDate.of(2025,8,13),"Argentina","Colombia",1000,true);
		envioMaskgRapido=new EnvioInternacional(LocalDate.of(2024,10,21),"Argentina","Colombia",1001,true);
		envio1kgEstandar=new EnvioInternacional(LocalDate.now(),"Argentina","Colombia",1000,false);
		envioMaskgEstandar=new EnvioInternacional(LocalDate.now(),"Argentina","Colombia",1001,false);

		menosKm=new EnvioInterurbano(LocalDate.now(),"La Plata","Formosa",1000,99);
		medioKm=new EnvioInterurbano(LocalDate.of(2024,10,21),"La Plata","Formosa",1000,100);
		masKm=new EnvioInterurbano(LocalDate.now(),"La Plata","Formosa",1000,501);
		
		entregaEstandar=new EnvioLocal(LocalDate.now(),"333 333","444 444",1000,false);
		entregaRapida=new EnvioLocal(LocalDate.now(),"333 333","444 444",1000,true);
		
		persona.agregarEnvio(envio1kgRapido);
		persona.agregarEnvio(menosKm);
		persona.agregarEnvio(entregaEstandar);
		
		corporativo.agregarEnvio(envioMaskgRapido);//
		corporativo.agregarEnvio(envio1kgEstandar);
		corporativo.agregarEnvio(envioMaskgEstandar);
		corporativo.agregarEnvio(medioKm);//
		corporativo.agregarEnvio(masKm);
		corporativo.agregarEnvio(entregaRapida);
		
		periodo=new DateLapse(LocalDate.of(2025, 9, 24),LocalDate.of(2025, 10, 31));
	}
	
	@Test
	void testCalcularMontoAPagar() {
		assertEquals(18900,persona.calcularMontoAPagar(periodo));
		assertEquals(63512,corporativo.calcularMontoAPagar(periodo));
	}
	
}
