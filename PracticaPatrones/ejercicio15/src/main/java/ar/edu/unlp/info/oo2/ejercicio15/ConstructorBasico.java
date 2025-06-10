package ar.edu.unlp.info.oo2.ejercicio15;

public class ConstructorBasico extends Constructor {

	public ConstructorBasico(Catalogo catalogo) {
		super(catalogo);
	}
	
	public ConstructorBasico() {
		
	}

	@Override
	public void construirPorcesador() {
		this.equipo.addComponente(this.catalogo.getComponente("Procesador basico"));
	}

	@Override
	public void construirMemoriaRam() {
		this.equipo.addComponente(this.catalogo.getComponente("8GB"));
	}

	@Override
	public void construirDisco() {
		this.equipo.addComponente(this.catalogo.getComponente("HDD 500 GB"));
	}

	@Override
	public void construirTarjetaGrafica() {
		
	}

	@Override
	public void construirGabinete() {
		this.equipo.addComponente(this.catalogo.getComponente("Gabinete estandar"));
	}

}
