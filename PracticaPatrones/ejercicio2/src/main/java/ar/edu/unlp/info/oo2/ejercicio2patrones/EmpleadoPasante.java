package ar.edu.unlp.info.oo2.ejercicio2patrones;

public class EmpleadoPasante extends Empleado {
	private int cantidadExamenesRendidos;
	
	public EmpleadoPasante (int cantidadExamenesRendidos) {
		this.cantidadExamenesRendidos = cantidadExamenesRendidos;
	}

	public double calcularSueldoBasico() {
		return 20000;
	}

	public double calcularAdicional() {
		return this.cantidadExamenesRendidos * 2000;
	}	
	
}
