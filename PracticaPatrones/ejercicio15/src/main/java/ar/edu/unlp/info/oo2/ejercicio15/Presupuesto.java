package ar.edu.unlp.info.oo2.ejercicio15;


import java.time.LocalDate;

public class Presupuesto {
	private String nombrePersona;
	private LocalDate fechaSolicitud;
	private Constructor equipo;
	
	
	public Presupuesto(String nombrePersona, Constructor equipo) {
		super();
		this.nombrePersona = nombrePersona;
		this.fechaSolicitud = LocalDate.now();
		this.equipo = equipo;
	}

	public Constructor getEquipo() {
		return equipo;
	}
	
	public void setEquipo(Constructor equipo) {
		this.equipo = equipo;
	}
	
	public void Construir () {
		this.equipo.construirPorcesador();
		this.equipo.construirMemoriaRam();
		this.equipo.construirDisco();
		this.equipo.construirTarjetaGrafica();
		this.equipo.construirGabinete();
	}
}
