package ar.edu.unlp.objetos.dos.ejercicio5;

import java.util.List;

public interface CriterioSugerencia {
	public List<Pelicula> sugerir (List<Pelicula> grilla, List<Pelicula> reproducidas);
}
