package ar.edu.unlp.info.oo2.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	private List<Componente> componentes = new ArrayList<Componente> ();
	
	public void addComponent (Componente componente) {
		this.componentes.add(componente);
	}
	
	public Componente getComponente(String componente) {
		return this.componentes.stream().filter(c -> c.getDescripcion().equals(componente))
				.findFirst().orElse(null);
	}
}
