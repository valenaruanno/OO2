package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends Raiz{
	private List<Raiz> contenido;
	
	public Directorio (String nombre) {
		super(nombre);
		this.contenido = new ArrayList<>();
	}
	
	public int tamanioContenido() {
		return this.contenido.stream().mapToInt(c -> c.tamanioTotalOcupado()).sum();
	}
	
	@Override
	public int tamanioTotalOcupado() {
		return 32 * 1000 + tamanioContenido();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream().map(r -> r.archivoMasGrande())
				.max((a1, a2) -> Integer.compare(a1.tamanioTotalOcupado(), a2.tamanioTotalOcupado()))
				.orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this.contenido.stream().map(r -> r.archivoMasNuevo())
				.max((a1,a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
				.orElse(null);
	}

	@Override
	public Raiz buscar(String nombre) {
		return this.contenido.stream().filter(c -> c.getNombre().equals(nombre))
				.findFirst().orElse(null);
	}

	@Override
	public List<Raiz> buscarTodos(String nombre) {
		return this.contenido.stream().filter(c -> c.getNombre().equals(nombre))
				.collect(Collectors.toList());
	}

	@Override
	public String listadoDeContenido() {
		return this.getNombre() + this.contenido.stream().map(c -> c.listadoDeContenido());
	}

}
