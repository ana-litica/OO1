package ar.edu.unlp.info.oo1.AlquilerDePropiedades;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class TestPropiedad {
	private Propiedad propiedad,propiedadNoReservada;
	private Reserva reserva,otraReserva;
	
	@BeforeEach
	void setUp() {
		propiedad=new Propiedad("333","Bosque",500.5);
		reserva=new Reserva(new DateLapse(LocalDate.of(2025, 10, 10),LocalDate.of(2025, 10, 25)),propiedad);
		otraReserva=new Reserva(new DateLapse(LocalDate.of(2025, 9, 1),LocalDate.of(2025, 9, 15)),propiedad);
		propiedad.agregarReserva(reserva);
		propiedad.agregarReserva(otraReserva);
		
		propiedadNoReservada=new Propiedad("444","Rio",700.0);
	}
	
	@Test
	void testConsultarDisponibilidad() {
		assertTrue(propiedad.consultarDisponibilidad(new DateLapse(LocalDate.of(2026, 10, 05),LocalDate.of(2026, 10,10))));
		assertFalse(propiedad.consultarDisponibilidad(new DateLapse(LocalDate.of(2025, 10, 05),LocalDate.of(2025, 10,10))));
	}
	
	@Test 
	void testCancelarReserva() {
		assertEquals(propiedad.getReservas().size(),2);
		propiedad.cancelarReserva(reserva);
		assertEquals(propiedad.getReservas().size(),1);
	}
	
	@Test 
	void testTotalPrecio() {
		assertEquals(500.5*15+500.5*14,propiedad.totalPrecio(new DateLapse(LocalDate.of(2025, 8, 28),LocalDate.of(2025,11, 1))));
		assertEquals(0,propiedadNoReservada.totalPrecio(new DateLapse(LocalDate.of(2025, 8, 28),LocalDate.of(2025,11, 1))));
	}
}
