package ar.edu.unlp.info.oo1.IntervaloDeTiempo;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class TestDateLapse {
	private DateLapse rangoFecha;
	private DateLapseV2 fechas2;
	
	@BeforeEach
	void setUp() {
		rangoFecha=new DateLapse(LocalDate.of(2025, 10, 1),LocalDate.of(2025, 10, 15));
		fechas2=new DateLapseV2(LocalDate.of(2025, 10, 1),14);
	}
	
	@Test
	void testSizeInDays() {
		assertEquals(14,rangoFecha.sizeInDays());
		assertEquals(14,fechas2.sizeInDays());
	}
	
	@Test 
	void testIncludeDays() {
		assertTrue(rangoFecha.includesDate(LocalDate.of(2025, 10, 10)));
		assertFalse(rangoFecha.includesDate(LocalDate.of(2026, 10, 10)));
		assertTrue(fechas2.includesDate(LocalDate.of(2025, 10, 10)));
		assertFalse(fechas2.includesDate(LocalDate.of(2026, 10, 10)));
	}
	
	@Test 
	void testOverlaps() {
		DateLapse another=new DateLapse(LocalDate.of(2025,9,27),LocalDate.of(2025, 10, 5));
		DateLapse another2=new DateLapse(LocalDate.of(2015,9,27),LocalDate.of(2015, 10, 5));
		assertTrue(rangoFecha.overlaps(another));		
		assertFalse(rangoFecha.overlaps(another2));
	}
}
