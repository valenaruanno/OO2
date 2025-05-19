package ar.edu.unlp.info.oo2.ejercicio21;

import java.time.LocalDate;

public class MamiferoNullObject extends Mamifero{

	
	public MamiferoNullObject(String identificador, String especie, LocalDate fechaNacimiento) {
		super(identificador, especie, fechaNacimiento);
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

}
