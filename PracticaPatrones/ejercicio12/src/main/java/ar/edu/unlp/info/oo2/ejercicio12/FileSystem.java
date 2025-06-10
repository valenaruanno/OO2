package ar.edu.unlp.info.oo2.ejercicio12;

import java.util.List;

public class FileSystem {
	private Directorio raiz;
	
	public FileSystem (Directorio raiz) {
		this.raiz = raiz;
	}
	
	public int tamanioTotalOcupado() {
		return this.raiz.tamanioTotalOcupado();
	}
	
	public Archivo archivoMasGrande() {
		return this.raiz.archivoMasGrande();
	}
	
	public Archivo archivoMasNuevo() {
		return this.raiz.archivoMasGrande();
	}
	
	public Raiz buscar(String nombre) {
		return this.raiz.buscar(nombre);
	}
	
	public List<Raiz> buscarTodos(String nombre){
		return this.raiz.buscarTodos(nombre);
	}
	
	public String listadoDeContenido(String path) {
		return this.raiz.listadoDeContenido(path);
	}
}
