package ar.edu.unlp.info.oo1.Ejercicio8;
import java.time.*;
public class Mamifero {
	private String identificador, especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre,madre,abuelaMaterna,abueloMaterno,abuelaPaterna,abueloPaterno;
	
	public Mamifero(String identificador) {
		this.identificador=identificador;
		this.fechaNacimiento=LocalDate.now();
	}
	
	public Mamifero() {
		
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getAbuelaMaterna() {
		if(this.madre!=null && this.madre.getMadre()!=null)
			return this.madre.getMadre();
		return null;
	}

	public Mamifero getAbueloMaterno() {
		if(this.madre!=null && this.madre.getPadre()!=null)
			return this.madre.getPadre();
		return null;
	}

	public Mamifero getAbuelaPaterna() {
		if(this.padre!=null && this.padre.getMadre()!=null)
			return this.padre.getMadre();
		return null;
	}

	public Mamifero getAbueloPaterno() {
		if(this.padre!=null && this.padre.getPadre()!=null)
			return this.padre.getPadre();
		return null;
	}

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (this.padre==unMamifero)||
				(this.madre==unMamifero)||
				(this.madre!=null && this.madre.tieneComoAncestroA(unMamifero))||
				(this.padre!=null &&this.padre.tieneComoAncestroA(unMamifero));
	}
	
	
}
