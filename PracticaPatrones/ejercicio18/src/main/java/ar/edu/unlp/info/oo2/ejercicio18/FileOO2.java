package ar.edu.unlp.info.oo2.ejercicio18;

import java.time.LocalDate;

public class FileOO2 implements FileComponent {
	private String nombre;
	private String extension;
	private String tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	
	public FileOO2(String nombre, String extension, String tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion,
			String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}


	public String getNombre() {
		return nombre;
	}


	public String getExtension() {
		return extension;
	}


	public String getTamaño() {
		return tamaño;
	}


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}


	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}


	public String getPermisos() {
		return permisos;
	}


	@Override
	public String prettyPrint() {
		return this.getNombre();
	}

}
