package ar.edu.unlp.objetos.dos.ejercicio2;

public class Papel implements Opcion {
	private String soy;
	
	public Papel (String soy) {
		this.soy = soy;
	}
	
	public String getSoy () {
		return this.soy;
	}
	
	public Opcion quienGana(Opcion otra) {
		if (otra.getSoy().equals("papel"))
			return null;
		else {
			if (otra.getSoy().equals("tijera"))
				return otra;
			else 
				return this;
		}
	}

}
