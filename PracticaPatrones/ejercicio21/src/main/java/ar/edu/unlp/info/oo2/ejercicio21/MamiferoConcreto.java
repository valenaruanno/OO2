package ar.edu.unlp.info.oo2.ejercicio21;

import java.time.LocalDate;
import java.util.Date;

public class MamiferoConcreto extends Mamifero{
	protected Mamifero padre = new MamiferoNullObject();
	protected Mamifero madre = new MamiferoNullObject();
	public MamiferoConcreto(String identificador, String especie, LocalDate fechaNacimiento) {
		super(identificador, especie, fechaNacimiento);
	}

	@Override
	public String getIdentificador() {
		return this.identificador;
	}

	@Override
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
		
	}

	@Override
	public String getEspecie() {
		return this.especie;
	}

	@Override
	public void setEspecie(String especie){
		this.especie = especie;
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;	
	}
	
	@Override
	public Mamifero getMadre() {
		return madre;
	}
	
	@Override
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	@Override
	public Mamifero getPadre() {
		return padre;
	}
	
	@Override
	public void setPadre(Mamifero padre) {
		this.padre = padre;
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
		return (this.padre.equals(unMamifero)) || 
				(this.madre.equals(unMamifero)) || 
			    (this.padre.tieneComoAncestroA(unMamifero)) || 
			    (this.madre.tieneComoAncestroA(unMamifero));
	}

}
