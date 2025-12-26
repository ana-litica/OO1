package ar.edu.unlp.info.oo1.ServiciosDeEnvioDePaquetes;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
private LocalDate from,to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from=from;
		this.to=to;
	}
	
//	“Retorna la fecha de inicio del rango”
	public LocalDate getFrom() {
		return from;
	}

//	“Retorna la fecha de fin del rango”
	public LocalDate getTo() {
		return to;
	}

//	“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
//	“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
	public boolean includesDate(LocalDate other) {
		return ((to.isAfter(other)||to.isEqual(other)) && (from.isBefore(other)||from.isEqual(other)));
	}

	/**
	Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
	**/
	public boolean overlaps (DateLapse anotherDateLapse) {
		return includesDate(anotherDateLapse.getFrom()) || includesDate(anotherDateLapse.getTo());
	}

}
