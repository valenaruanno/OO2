package ar.edu.unlp.objetos.dos.ejercicio6;

public class Provisoria extends Estado{	
	public Provisoria () {
		
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return super.obtenerInformacion(excursion) + 
				"Usuarios faltantes para alcanzar el cupo minimo: " + 
				excursion.usuariosFaltantesCupoMinimo();
	}

	@Override
	public void manejarInscripcion(Usuario unUsuario, Excursion excursion) {
		excursion.inscribirUsuario(unUsuario);
		if (excursion.cupoInscriptosMinimoCompleto())
			excursion.setEstado(new Definitiva ());
	}

}
