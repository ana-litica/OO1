package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.*;
import java.util.stream.Collectors;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre=nombre;
		emails=new ArrayList<>();
	}
	
	public void recibirMail(Email email) {
		emails.add(email);
	}
	
	public void mover(Email email, Carpeta destino) {
		emails.remove(email);
		destino.recibirMail(email);
	}
	
	public int tamañoCarpeta() {
			return emails.stream().mapToInt(em->em.espacioMail()).sum();
	}
	
	public List<Email> filtrarPorTexto(String texto){	
		return emails.stream()
				.filter(e->e.contieneTexto(texto)!=(null))
				.collect(Collectors.toList());		
	}
}
