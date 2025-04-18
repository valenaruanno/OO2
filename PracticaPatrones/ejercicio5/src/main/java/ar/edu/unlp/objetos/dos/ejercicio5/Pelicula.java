package ar.edu.unlp.objetos.dos.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private LocalDate añoDeEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, LocalDate añoDeEstreno, double puntaje) {
		super();
		this.titulo = titulo;
		this.añoDeEstreno = añoDeEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<>();
	}
	
	public void agregarSimilar (Pelicula pelicula) {
		this.similares.add(pelicula);
	}

	public List<Pelicula> getSimilares(){
		return this.similares;
	}
	
	public LocalDate getAñoDeEstreno() {
		return añoDeEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	
	
}
