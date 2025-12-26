package ar.edu.unlp.info.oo1.Ejercicio9;
import java.util.*;

public class Farola {
	private boolean on;
	private List<Farola> vecinas;
	
	public Farola() {
		on=false;
		this.vecinas=new ArrayList<>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!this.vecinas.contains(otraFarola)) {
			this.vecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors(){
		return this.vecinas;
	}
	
	public void turnOn() {
		if(this.isOff()) {
			this.on=true;
			this.vecinas.stream().forEach(v->v.turnOn());
		}
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.on=false;
			this.vecinas.stream().forEach(v->v.turnOff());
		}
	}
	
	public boolean isOn() {
		return on==true;
	}
	
	public boolean isOff() {
		return on==false;
	}
	
}
