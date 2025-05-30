package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisica extends Cliente{
	private String dni;
	private static double descuentoFis = 0;
	
	public ClienteFisica(String nombre, String dni){
		super(nombre);
		this.dni = dni;
	}

	@Override
	public double calcularDescuento(double auxc) {
		return auxc*descuentoFis;
	}
}
