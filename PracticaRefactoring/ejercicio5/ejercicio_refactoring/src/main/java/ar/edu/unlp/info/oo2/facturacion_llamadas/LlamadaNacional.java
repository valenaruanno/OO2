package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{

	public LlamadaNacional(String origen, String destino, int duracion){
		super(origen, destino, duracion);
	}
	
	protected double valor() {
		return 150;
	}
	
	protected double adicional() {
		return 50;
	}
	
}
