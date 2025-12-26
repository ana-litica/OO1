package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.*;

public class Email {
	private String titulo,cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo,String cuerpo) {
		this.titulo=titulo;
		this.cuerpo=cuerpo;
		adjuntos=new ArrayList<>();
	}
	
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;	
	}
	
	public void agregarArchivo(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
	public List<Archivo> adjuntos(){
		return this.adjuntos;
	}
	
	public Email contieneTexto(String texto) {
		if(titulo.contains(texto)||cuerpo.contains(texto))
			return this;
		return null;
	}
	
	public int espacioMail() {
		return titulo.length()+cuerpo.length()+
				adjuntos.stream().mapToInt(adj->adj.tamaño()).sum();
	}
}
