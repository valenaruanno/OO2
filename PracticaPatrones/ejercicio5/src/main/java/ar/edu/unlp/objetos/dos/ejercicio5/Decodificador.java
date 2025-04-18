package ar.edu.unlp.objetos.dos.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private CriterioSugerencia criterio;
	
	public Decodificador () {
		grilla = new ArrayList<>();
		reproducidas = new ArrayList<>();
	}
	
	public void setCriterio (CriterioSugerencia criterio) {
		this.criterio = criterio;
	}

	public void agregarAgrilla (Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void agregarAreproducidas (Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public List<Pelicula> sugerir (){
		return this.criterio.sugerir(grilla, reproducidas);
	}
	
}
