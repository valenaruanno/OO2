package ar.edu.unlp.info.oo2.ejercicio21;

import java.time.LocalDate;

public abstract class Mamifero {
	protected String identificador;
	protected String especie;
	protected LocalDate fechaNacimiento;
	
	public Mamifero(String identificador, String especie, LocalDate fechaNacimiento) {
		super();
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero() {
	}

	public abstract String getIdentificador();
	public abstract void setIdentificador(String identificador);
	public abstract String getEspecie();
	public abstract void setEspecie(String especie);
	public abstract LocalDate getFechaNacimiento();
	public abstract void setFechaNacimiento(LocalDate fechaNacimiento);
	public abstract Mamifero getAbueloPaterno();
	public abstract Mamifero getAbueloMaterno();
	public abstract Mamifero getAbuelaPaterna();
	public abstract Mamifero getAbuelaMaterna();
	public abstract boolean tieneComoAncestroA(Mamifero mamifero);

	protected abstract Mamifero getPadre();
	protected abstract void setPadre(Mamifero padre);

	protected abstract Mamifero getMadre();
	protected abstract void setMadre(Mamifero madre);
}
