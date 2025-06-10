package ar.edu.unlp.info.oo2.ejercicio21;

import java.time.LocalDate;

public class MamiferoNullObject extends Mamifero{

	
	public MamiferoNullObject(String identificador, String especie, LocalDate fechaNacimiento) {
		super(identificador, especie, fechaNacimiento);
	}

	public MamiferoNullObject() {
		super();
	}

	@Override
	public Mamifero getAbueloPaterno() {
		return null;
	}

	@Override
	public Mamifero getAbueloMaterno() {
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return null;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return null;
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		return false;
	}

	@Override
	public String getIdentificador() {
		return "";
	}

	@Override
	public void setIdentificador(String identificador) {
	}

	@Override
	public String getEspecie() {
		return "";
	}

	@Override
	public void setEspecie(String especie) {
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return null;
	}

	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
	}

	@Override
	protected Mamifero getPadre() {
		return null;
	}

	@Override
	protected Mamifero getMadre() {
		return null;
	}

	@Override
	protected void setPadre(Mamifero padre) {
		
	}

	@Override
	protected void setMadre(Mamifero madre) {
		
	}

}
