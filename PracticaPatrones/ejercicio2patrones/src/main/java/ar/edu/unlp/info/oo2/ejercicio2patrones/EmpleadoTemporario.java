package ar.edu.unlp.info.oo2.ejercicio2patrones;

public class EmpleadoTemporario extends Empleado{
	private double horasDeTrabajo;
	private boolean estaCasado;
	private int cantidadHijos;
	
	public EmpleadoTemporario (double horasDeTrabajo, boolean estaCasado, int cantidadHijos) {
		this.horasDeTrabajo = horasDeTrabajo;
		this.estaCasado = estaCasado;
		this.cantidadHijos = cantidadHijos;
	}
	
	private double calcularCantidadPorHoras () {
		return this.horasDeTrabajo * 300; 
	}

	public double calcularSueldoBasico() {
		return 20000 + this.calcularCantidadPorHoras();
	}

	public double calcularCantidadPorCasado () {
		if (this.estaCasado)
			return 5000;
		else
			return 0; 
	}
	
	private double calcularCantidadPorHijos() {
		return this.cantidadHijos * 2000;
	}
	
	public double calcularAdicional() {
		return this.calcularCantidadPorHijos() + this.calcularCantidadPorCasado();
	}


}
