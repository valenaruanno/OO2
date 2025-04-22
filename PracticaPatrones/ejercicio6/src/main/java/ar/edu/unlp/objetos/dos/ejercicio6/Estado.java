package ar.edu.unlp.objetos.dos.ejercicio6;

public abstract class Estado {
	
	public Estado () {
		
	}
	
	public abstract void manejarInscripcion (Usuario unUsuario, Excursion excursion);
	
	public abstract String obtenerInformacion (Excursion excursion);
	

}
