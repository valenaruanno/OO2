package ar.edu.unlp.info.oo2.ejercicio9;

import java.time.LocalDate;

public class Reserva {
	private int cantidadDias;
	private LocalDate fecha;
	private AutoEnAlquiler auto;
	private Usuario conductor;
	
	public Reserva (int cantidadDias, LocalDate fecha, AutoEnAlquiler auto, Usuario usuario) {
		this.cantidadDias = cantidadDias;
		this.fecha =fecha;
		this.auto = auto;
		this.conductor = usuario;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	
	public double montoAPagar () {
		return cantidadDias * this.auto.getPrecioPorDia();
	}

	public double montoAReembolsar(LocalDate cancelacion) {
		if (LocalDate.now().isBefore(fecha)) 
			return this.auto.monto(this, cancelacion);
		else 
			return 0;
	}
}
