package ar.edu.unlp.info.oo2.ejercicio9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada extends Politica{

	@Override
	public double monto(Reserva reserva, LocalDate cancelacion) {
		long dias = ChronoUnit.DAYS.between(reserva.getFecha(), cancelacion);
		if (dias > 7)
			return reserva.montoAPagar();
		else {
			if (dias > 2)
				return reserva.montoAPagar() / 2;
			else 
				return 0;
		}
	}

}
