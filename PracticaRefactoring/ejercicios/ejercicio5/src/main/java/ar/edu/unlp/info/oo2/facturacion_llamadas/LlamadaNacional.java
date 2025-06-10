package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{

	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}
	
	public double montoAMultiplicarParaCalcularDuracion(){
		return 3;
	}
	public double calcularMontoDuracion(){
		return this.getDuracion() * this.montoAMultiplicarParaCalcularDuracion();
	}
	public double calcularDescuento (){
		return this.calcularMontoDuracion() * 0.21;
	}
	public double adicional(){
		return 0;
	}
	public double calcularMontoLlamada() {
		return this.calcularMontoDuracion() + 
			this.calcularDescuento() + this.adicional();
	}
}
