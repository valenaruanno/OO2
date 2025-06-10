package ar.edu.unlp.info.oo2.ejercicio14;

import java.time.LocalDate;
import java.time.Period;

public class Automovil extends Prenda{
	private LocalDate modelo;
	private double kilometraje;
	private double costo0km;
	
	
	public Automovil(String nombre, LocalDate modelo, double kilometraje, double costo0km) {
		super(nombre, 0.7);
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.costo0km = costo0km;
	}

	public int calcularAntiguedad() {
		return Period.between(modelo, LocalDate.now()).getYears();
	}
	public double calcularDiezPorciento() {
		return this.costo0km * (this.calcularAntiguedad() * 0.10);
	}
	@Override
	public double calcularValor() {
		return this.costo0km - this.calcularDiezPorciento();
	}
	
}
