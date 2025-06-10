package ar.edu.unlp.info.oo2.ejercicio15;

import java.util.List;

public class Equipo {
	private List<Componente> componentes;
	
	public void addComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public double calcularPrecio() {
		return this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
	}
	
	public double calcularCincuentaPorcientoConsumo () {
		return this.calcularConsumo() * 0.5;
	}
	
	public double calcularConsumo() {
		return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
	}
}
