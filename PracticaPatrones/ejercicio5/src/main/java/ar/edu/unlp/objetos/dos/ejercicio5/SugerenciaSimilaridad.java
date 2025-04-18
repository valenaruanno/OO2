package ar.edu.unlp.objetos.dos.ejercicio5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaSimilaridad implements CriterioSugerencia {

	@Override
	public List<Pelicula> sugerir(List<Pelicula> grilla, List<Pelicula> reproducidas) {
		return grilla.stream().filter(p -> !reproducidas.contains(p))
			.filter(p -> reproducidas.stream().anyMatch(r -> r.getSimilares().contains(p)))
			.sorted(Comparator.comparing(Pelicula::getAñoDeEstreno).reversed())
			.limit(3).collect(Collectors.toList());
	}

}
