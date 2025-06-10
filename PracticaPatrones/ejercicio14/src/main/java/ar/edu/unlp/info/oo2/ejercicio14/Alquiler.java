package ar.edu.unlp.info.oo2.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Prenda{
	private LocalDate inicioContrato;
	private LocalDate finContrato;
	private double costoMensual;
	
	
	public Alquiler(String nombre, LocalDate inicioContrato, LocalDate finContrato,
			double costoMensual) {
		super(nombre, 0.9);
		this.inicioContrato = inicioContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}

	public long calcularMesesEntre () {
		return ChronoUnit.MONTHS.between(inicioContrato, finContrato);
	}
	@Override
	public double calcularValor() {
		return this.calcularMesesEntre() * this.costoMensual;
	}

}
