package ar.edu.unlp.objetos.dos.ejercicio2;

public class Papel extends Opcion {
	
	public Papel (String soy) {
		super(soy);
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
