package ar.edu.unlp.info.oo2.ejercicio9;

import java.time.LocalDate;

public class PoliticaEstricta extends Politica{

	@Override
	public double monto(Reserva reserva, LocalDate cancelacion) {
		return 0;
	}

}
