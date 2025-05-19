package ar.edu.unlp.info.oo2.ejercicio21;

import java.time.LocalDate;
import java.util.Date;

public class MamiferoConcreto extends Mamifero{
	
	
	

	public MamiferoConcreto(String identificador, String especie, LocalDate fechaNacimiento) {
		super(identificador, especie, fechaNacimiento);
	}

	public Mamifero getAbueloMaterno() {
		return this.getMadre().getPadre();
	}

	public Mamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}

	public Mamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}

	public Mamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}

	public boolean tieneComoAncestroA (Mamifero unMamifero) {
		return (this.getPadre() == unMamifero) || 
				(this.getMadre() == unMamifero) || 
			    (this.getPadre().tieneComoAncestroA(unMamifero)) || 
			    (this.getMadre().tieneComoAncestroA(unMamifero));
	}
	
	
}
