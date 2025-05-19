package ar.edu.unlp.info.oo2.ejercicio21;

import java.time.LocalDate;

public abstract class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	
	public Mamifero(String identificador, String especie, LocalDate fechaNacimiento) {
		super();
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.madre = null;
		this.padre = null;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public abstract Mamifero getAbueloPaterno();
	public abstract Mamifero getAbueloMaterno();
	public abstract Mamifero getAbuelaPaterna();
	public abstract Mamifero getAbuelaMaterna();
	public abstract boolean tieneComoAncestroA(Mamifero mamifero);
}
