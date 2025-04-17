package ar.edu.unlp.info.oo2.ejercicio2patrones;

public abstract class Empleado {
	
	protected double descuentoSueldoBasico () {
		return this.calcularSueldoBasico() * 0.13;
	}
	
	protected double descuentoAdicional () {
		return this.calcularAdicional() * 0.05;
	}
	
	public double calcularDescuento() {
		return this.descuentoSueldoBasico() + this.descuentoAdicional();
	}
	
	public double sueldo () {
		return this.calcularSueldoBasico() + this.calcularAdicional() - this.calcularDescuento();
	}
	
	public abstract double calcularSueldoBasico();
	public abstract double calcularAdicional();
}
