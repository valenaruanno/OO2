package ar.edu.unlp.objetos.dos.ejercicio2;

public class Tijera extends Opcion {
	
	public Tijera (String soy) {
		super(soy);
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
