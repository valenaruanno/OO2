package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{
	
	public LlamadaInternacional(String origen, String destino, int duracion){
		super(origen, destino, duracion);
	}

	protected double valor() {
		return 3;
	}
	
	protected double adicional() {
		return 0;
	}

}
