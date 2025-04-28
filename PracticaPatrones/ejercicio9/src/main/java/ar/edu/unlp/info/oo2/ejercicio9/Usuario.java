package ar.edu.unlp.info.oo2.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler> autosEnAlquiler;

	public Usuario(String nombre) {
		this.nombre = nombre;
		this.autosEnAlquiler = new ArrayList<>();
	}
	
	public void addAtuosEnAlquiler (AutoEnAlquiler auto) {
		this.autosEnAlquiler.add(auto);
	}
}
