package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.*;
import java.util.stream.Collectors;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		inbox=new Carpeta("Inbox");
		carpetas=new ArrayList<>();
		carpetas.add(inbox);
	}
	
	public void recibir (Email email) {
		inbox.recibirMail(email);
	}
	
	public int espacioOcupado() {
		return carpetas.stream().mapToInt(c->c.tamañoCarpeta()).sum();
	}
	
	//Devuelve la primera carpeta que contiene el texto
	private Carpeta carpetaCoincidentes(String texto){
		return carpetas.stream()
				.filter(c->c.filtrarPorTexto(texto)!=null).findFirst().orElse(null);
	}
	
	//Devuelve el primer mail que contiene el texto	
	public Email buscar(String texto) {		
		return this.carpetaCoincidentes(texto).filtrarPorTexto(texto)
				.stream()
				.map(mail->mail.contieneTexto(texto))
				.findFirst().orElse(null);				
	}
}
