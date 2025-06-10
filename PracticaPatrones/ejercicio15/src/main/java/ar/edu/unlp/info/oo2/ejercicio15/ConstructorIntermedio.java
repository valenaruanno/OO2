package ar.edu.unlp.info.oo2.ejercicio15;

public class ConstructorIntermedio extends Constructor {

	public ConstructorIntermedio(Catalogo catalogo) {
		super(catalogo);
	}
	
	public ConstructorIntermedio() {
		
	}

	@Override
	public void construirPorcesador() {
		this.equipo.addComponente(this.catalogo.getComponente("Procesador intermedio"));
	}

	@Override
	public void construirMemoriaRam() {
		this.equipo.addComponente(this.catalogo.getComponente("16GB"));
	}

	@Override
	public void construirDisco() {
		this.equipo.addComponente(this.catalogo.getComponente("SSD 500 GB"));
	}

	@Override
	public void construirTarjetaGrafica() {
		this.equipo.addComponente(this.catalogo.getComponente("GTX 1650"));
	}

	@Override
	public void construirGabinete() {
		this.equipo.addComponente(this.catalogo.getComponente("Gabinete intermedio"));
		this.equipo.addComponente(this.catalogo.getComponente("Fuente 800w"));
	}

}
