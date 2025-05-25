package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public abstract class Raiz {
	private String nombre;
	private LocalDate fechaDeCreacion;
	
	public Raiz (String nombre){
		this.nombre = nombre;
		this.fechaDeCreacion = LocalDate.now();
	}
	
	
	public abstract int tamanioTotalOcupado();
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();
	
	public abstract Raiz buscar(String nombre);

	public abstract List<Raiz> buscarTodos(String nombre);

	public abstract String listadoDeContenido();


	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return this.fechaDeCreacion;
	}
}
