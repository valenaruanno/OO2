package ar.edu.unlp.info.oo2.Parcial1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	private double interes;
	
	public Banco () {
		this.clientes = new ArrayList<>();
	}
	
	public void registrarCliente (Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void solicitarPrestamoSimple (Cliente cliente, double montoSolicitado, int cantidadCuotas) {
		Prestamo p = new PrestamoSimple (cliente, montoSolicitado, cantidadCuotas, this.interes);
		cliente.addPrestamo(p);
	}
	
	public void solicitarPrestamoUVA (Cliente cliente, double montoSolicitado, int cantidadCuotas) {
		Prestamo p = new PrestamoUVA (cliente, montoSolicitado, cantidadCuotas);
		cliente.addPrestamo(p);
	}
	
}
