package ar.edu.unlp.objetos.dos.ejercicio2;

public class Piedra extends Opcion{
	
	public Piedra (String soy) {
		super(soy);
	}
	
	public Opcion quienGana(Opcion otra) {
		if (otra.getSoy().equals("piedra"))
			return null;
		else {
			if (otra.getSoy().equals("papel"))
				return otra;
			else 
				return this;
		}
	}

}
