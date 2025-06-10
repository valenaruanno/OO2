package ar.edu.unlp.info.oo2.ejercicio14;

import java.util.List;

public class PrendaCombinada extends PrendaComponent{
	private List<PrendaComponent> prendas;
	public PrendaCombinada(String nombre) {
		super(nombre, 0.50);
	}

	public double calcularValor() {
	    return this.prendas.stream()
	        .mapToDouble(p -> p.calcularValor())
	        .sum();
	}

}
