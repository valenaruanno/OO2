package ar.edu.unlp.info.oo2.ejercicio18;

import java.time.LocalDate;

public interface FileComponent {
	public abstract String prettyPrint();

	public abstract String getNombre();
	public abstract String getExtension();
	public abstract String getTamaño();
	public abstract LocalDate getFechaCreacion();
	public abstract LocalDate getFechaModificacion();
	public abstract String getPermisos();
}
