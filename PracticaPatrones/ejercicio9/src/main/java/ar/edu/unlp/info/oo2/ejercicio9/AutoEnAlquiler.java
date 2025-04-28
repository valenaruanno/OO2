package ar.edu.unlp.info.oo2.ejercicio9;

import java.time.LocalDate;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlazas;
	private String marcas;
	private Politica politica;
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marcas, Politica politica) {
		super();
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marcas = marcas;
		this.politica = politica;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPolitica(Politica politica) {
		this.politica = politica;
	}

	public double monto(Reserva reserva, LocalDate cancelacion) {
		return this.politica.monto(reserva, cancelacion);
	}
	
	
}
