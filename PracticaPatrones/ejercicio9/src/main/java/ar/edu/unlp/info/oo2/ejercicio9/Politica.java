package ar.edu.unlp.info.oo2.ejercicio9;

import java.time.LocalDate;

public abstract class Politica {

	public abstract double monto(Reserva reserva, LocalDate cancelacion);

}
