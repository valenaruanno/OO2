package ar.edu.unlp.objetos.dos.ejercicio6;

public class Provisoria extends Estado{	
	public Provisoria () {
		
	}

	public String obtenerInformacion(Excursion excursion) {
		return "Usuarios faltantes para alcanzar el cupo minimo: " + 
				excursion.usuariosFaltantesCupoMinimo();
	}

	@Override
	public void manejarInscripcion(Usuario unUsuario, Excursion excursion) {
		excursion.inscribirUsuario(unUsuario);
		if (excursion.cupoInscriptosMinimoCompleto())
			excursion.setEstado(new Definitiva ());
	}

}
