package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridica extends Cliente{
	private String cuit;
	private static double descuentoJur = 0.15;
	
	public ClienteJuridica(String nombre, String cuit){
		super(nombre);
		this.cuit = cuit;
	}

	@Override
	public double calcularDescuento(double auxc) {
		return auxc*descuentoJur;
	}
	
}
