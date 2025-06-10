package ar.edu.unlp.info.oo2.Parcial1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private double salarioMensual;
	private List<Prestamo> prestamos;
	
	public Cliente (String nombre, double salarioMensual) {
		this.nombre = nombre;
		this.salarioMensual = salarioMensual;
		this.prestamos = new ArrayList<>();
	}
	
	public double treintaPorcientoSalario() {
		return this.salarioMensual * 0.3;
	}
	
	public void addPrestamo(Prestamo prestamo) {
		this.prestamos.add(prestamo);
	}
	
	
}
