package ar.edu.unlp.info.oo2.Parcial1;

public class PrestamoSimple extends Prestamo {
	private double tasaInteres;
	
	public PrestamoSimple(Cliente cliente, double monto, int cantidadCuotas, double interes) {
		super(cliente, monto, cantidadCuotas);
		tasaInteres = interes;
	}

	

}
