package ar.edu.unlp.info.oo1.AlquilerDePropiedades;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class TestUsuario {
	private Usuario usuario,otroUsuario;
	private Propiedad propiedad,propiedadPropia,otraPropia;
	private Reserva reserva,otraReserva;
	
	@BeforeEach
	void setUp() {
		usuario=new Usuario("Pepe","333 444",22222222);
		propiedad=new Propiedad("333","Bosque",500.5);
		propiedadPropia=new Propiedad("444","Rio",700.0);
		otraPropia=new Propiedad("555","Aire",430.25);
		reserva=new Reserva(new DateLapse(LocalDate.of(2025, 10, 10),LocalDate.of(2025, 10, 25)),propiedadPropia);
		otraReserva=new Reserva(new DateLapse(LocalDate.of(2025, 9, 1),LocalDate.of(2025, 9, 15)),otraPropia);

		propiedadPropia.agregarReserva(reserva);
		otraPropia.agregarReserva(otraReserva);
		
		usuario.agregarPropiedad(propiedadPropia);
		usuario.agregarPropiedad(otraPropia);
		usuario.crearReserva(propiedad, new DateLapse(LocalDate.of(2025, 10, 10),LocalDate.of(2025, 10, 25)));
		
		otroUsuario=new Usuario("Jose","666 777",33333333);
	}
	
	@Test 
	void testCalcularIngresos() {
		DateLapse periodo=new DateLapse(LocalDate.of(2025, 8, 28),LocalDate.of(2025,11, 1));
		assertEquals((700.0*15+430.25*14)*0.75,usuario.calcularIngresos(periodo));
		assertEquals(0,otroUsuario.calcularIngresos(periodo));
	}
}
