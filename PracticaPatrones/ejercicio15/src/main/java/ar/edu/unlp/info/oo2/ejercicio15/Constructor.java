package ar.edu.unlp.info.oo2.ejercicio15;

public abstract class Constructor {
	protected Equipo equipo;
	protected Catalogo catalogo;
	
	
	public Constructor(Catalogo catalogo) {
		this.equipo = new Equipo ();
		this.catalogo = catalogo;
	}
	
	public Constructor() {
		this.equipo = new Equipo ();
	}

	public Equipo getEquipo() {
		return equipo;
	}
	
	
	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public void reset() {
		this.equipo = new Equipo();
	}
	
	public abstract void construirPorcesador();
	public abstract void construirMemoriaRam();
	public abstract void construirDisco();
	public abstract void construirTarjetaGrafica();
	public abstract void construirGabinete();
	
}
