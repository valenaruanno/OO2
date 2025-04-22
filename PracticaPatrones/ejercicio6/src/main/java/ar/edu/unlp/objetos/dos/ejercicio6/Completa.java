package ar.edu.unlp.objetos.dos.ejercicio6;

public class Completa implements Estado{

	public Completa () {
		
	}
	
	@Override
	public void manejarInscripcion(Usuario unUsuario, Excursion excursion) {
		excursion.agregarUsuarioListaDeEspera(unUsuario);
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return "";
	}

}
