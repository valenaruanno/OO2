package ar.edu.unlp.objetos.dos.ejercicio6;

public abstract class Estado {
	
	public Estado () {
		
	}
	
	public abstract void manejarInscripcion (Usuario unUsuario, Excursion excursion);
	
	public String obtenerInformacion (Excursion excursion) {
		return excursion.toString();
	}
}
