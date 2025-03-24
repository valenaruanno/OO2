package ar.edu.unlp.objetos.dos.ejercicio2;

public class Piedra implements Opcion{
	private String soy;
	
	public Piedra (String soy) {
		this.soy = soy;
	}
	
	public String getSoy () {
		return this.soy;
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
