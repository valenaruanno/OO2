package ar.edu.unlp.objetos.dos.ejercicio6;

public class Definitiva extends Estado{

	public Definitiva () {
		
	}
	
	@Override
	public String obtenerInformacion(Excursion excursion) {
		return super.obtenerInformacion(excursion) + 
				"Emails : " + excursion.emailDeUsuariosInscriptos() +
				"Cantidad de usuarios faltantes para alcanzar el cupo maximo" + 
				excursion.usuariosFaltantesCupoMaximo();
	}

	@Override
	public void manejarInscripcion(Usuario unUsuario, Excursion excursion) {
		excursion.inscribirUsuario(unUsuario);
		if (excursion.cupoInscriptosMaximoCompleto())
			excursion.setEstado(new Completa());
	}

}
