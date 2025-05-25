package ar.edu.unlp.info.oo2.ejercicio12;

import java.util.List;

public class Archivo extends Raiz {
	private int tamanioEnBytes;
	
	public Archivo(String nombre, int tamanioEnBytes) {
		super(nombre);
		this.tamanioEnBytes = tamanioEnBytes;
	}

	@Override
	public int tamanioTotalOcupado() {
		return this.tamanioEnBytes;
	}

	@Override
	public Archivo archivoMasGrande() {
		return null;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return null;
	}

	@Override
	public Raiz buscar(String nombre) {
		return null;
	}

	@Override
	public List<Raiz> buscarTodos(String nombre) {
		return null;
	}

	@Override
	public String listadoDeContenido() {
		return null;
	}

}
