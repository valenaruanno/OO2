package ar.edu.unlp.objetos.dos.ejercicio2;

public class Tijera implements Opcion {
	private String soy;
	
	public Tijera (String soy) {
		this.soy = soy;
	}
	
	public String getSoy () {
		return this.soy;
	}
	
	public Opcion quienGana(Opcion otra) {
		if (otra.getSoy().equals("tijera"))
			return null;
		else {
			if (otra.getSoy().equals("piedra"))
				return otra;
			else 
				return this;
		}
	}

}
