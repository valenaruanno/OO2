package ar.edu.unlp.info.oo2.ejercicio2patrones;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class EmpleadoPlanta extends Empleado{
	private boolean estaCasado;
	private int cantidadHijos;
	private LocalDate fechaIngreso;
	
	public EmpleadoPlanta (boolean estaCasado, int cantidadHijos, LocalDate fechaIngreso) {
		this.estaCasado = estaCasado;
		this.cantidadHijos = cantidadHijos;
		this.fechaIngreso = fechaIngreso;
	}

	public double calcularSueldoBasico() {
		return 50000;
	}


	private double calcularCantidadPorCasado() {
		if (this.estaCasado)
			return 5000;
		else
			return 0;
	}
	
	private double calcularCantidadPorHijos() {
		return 2000 * this.cantidadHijos;
	}
	
	private double calcularCantidadPorAntiguedad() {
		return 2000 * Period.between(this.fechaIngreso, LocalDate.now()).getYears();
	}
	
	public double calcularAdicional() {

		return this.calcularCantidadPorCasado() + this.calcularCantidadPorHijos() + this.calcularCantidadPorAntiguedad();
	}
	
	
	
}
