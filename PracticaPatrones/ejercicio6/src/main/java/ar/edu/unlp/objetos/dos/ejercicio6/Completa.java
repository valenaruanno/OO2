package ar.edu.unlp.objetos.dos.ejercicio6;

public class Completa extends Estado{

	public Completa () {
		
	}
	
	@Override
	public void manejarInscripcion(Usuario unUsuario, Excursion excursion) {
		excursion.agregarUsuarioListaDeEspera(unUsuario);
	}

}
