package ar.edu.unlp.info.oo1.AlquilerDePropiedades;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.chrono.*;

public class TestReserva {
	private Reserva reserva;
	
	
	@BeforeEach
	void setUp() {
		reserva=new Reserva(new DateLapse(LocalDate.of(2025, 10, 10),LocalDate.of(2025, 10, 25)),new Propiedad("333","Avellaneda",500.50));
	}
	
	@Test
	void testCalcularPrecio() {
		assertEquals(reserva.calcularPrecio(),7507.5);
	}
	
	@Test 
	void testDentroDelPeriodo() {
		assertTrue(reserva.dentroDelPeriodo(new DateLapse(LocalDate.of(2025, 10, 05),LocalDate.of(2025, 10,10))));
		assertFalse(reserva.dentroDelPeriodo(new DateLapse(LocalDate.of(2025, 10, 26),LocalDate.of(2025, 10, 31))));
	}
}
