package ar.edu.unlp.info.oo2.Parcial1;

public abstract class Prestamo {
	private double monto;
	private int cantidadCuotas;
	private Cliente cliente;
	private Estado estado;
	
	public Prestamo(Cliente cliente, double monto, int cantidadCuotas) {
		this.cliente = cliente;
		this.monto = monto;
		this.cantidadCuotas = cantidadCuotas;
		if (checkParaEstado()) {
			this.estado = new Rechazado();
		} else {
			this.estado = new 
		}
	}
	
	public boolean checkParaEstado() {
		return this.calcularValorCuota() > this.cliente.treintaPorcientoSalario();
	}
	
	public double calcularValorCuota() {
		return this.monto / this.cantidadCuotas * this.getInteres();
	}
	
	public abstract double getInteres();
}
