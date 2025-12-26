package ar.edu.unlp.info.oo1.IntervaloDeTiempo;
import java.time.*;
import java.time.temporal.*;

public class DateLapseV2 implements Date{
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseV2(LocalDate from,int dias) {
		this.from=from;
		this.sizeInDays=dias;
	}
	
	public LocalDate getFrom() {
	return this.from;
	}
	
	public LocalDate getTo() {
		return from.plusDays(sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		return ((from.isBefore(other)||from.isEqual(other)) && (this.getTo().isAfter(other)||this.getTo().isEqual(other)));
	}
}
