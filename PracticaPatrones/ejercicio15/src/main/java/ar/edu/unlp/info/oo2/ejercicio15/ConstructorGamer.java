package ar.edu.unlp.info.oo2.ejercicio15;

public class ConstructorGamer extends Constructor {

	public ConstructorGamer(Catalogo catalogo) {
		super(catalogo);
	}
	
	public ConstructorGamer() {
		
	}

	@Override
	public void construirPorcesador() {
		this.equipo.addComponente(this.catalogo.getComponente("Procesador gamer"));
		this.equipo.addComponente(this.catalogo.getComponente("Pad termico"));
		this.equipo.addComponente(this.catalogo.getComponente("Cooler"));
	}

	@Override
	public void construirMemoriaRam() {
		this.equipo.addComponente(this.catalogo.getComponente("32GB"));
		this.equipo.addComponente(this.catalogo.getComponente("32GB"));
	}

	@Override
	public void construirDisco() {
		this.equipo.addComponente(this.catalogo.getComponente("SSD 500 GB"));
		this.equipo.addComponente(this.catalogo.getComponente("SSD 1 TB"));
	}

	@Override
	public void construirTarjetaGrafica() {
		this.equipo.addComponente(this.catalogo.getComponente("RTX 4090"));
	}

	@Override
	public void construirGabinete() {
		this.equipo.addComponente(this.catalogo.getComponente("Gabinete gamer"));
		double consumo = this.equipo.calcularConsumo() + this.equipo.calcularCincuentaPorcientoConsumo();
		this.equipo.addComponente(this.catalogo.getComponente("Fuente " + consumo + "w"));
	}

}
