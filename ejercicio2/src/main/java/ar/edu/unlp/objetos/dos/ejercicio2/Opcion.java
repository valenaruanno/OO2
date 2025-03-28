package ar.edu.unlp.objetos.dos.ejercicio2;

public abstract class Opcion {
	private String soy;
	
	public Opcion (String soy) {
		this.soy = soy;
	}
	
	
	public String getSoy () {
		return this.soy;
	}
	public abstract Opcion quienGana (Opcion opcion);
}
