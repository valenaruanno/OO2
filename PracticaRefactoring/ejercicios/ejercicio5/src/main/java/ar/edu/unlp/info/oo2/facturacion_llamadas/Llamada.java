package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(String origen, String destino, int duracion) {
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}
	
	public abstract double montoAMultiplicarParaCalcularDuracion();
	
	public double calcularMontoDuracion(){
		return this.getDuracion() * this.montoAMultiplicarParaCalcularDuracion();
	}
	
	public double calcularDescuento (){
		return this.calcularMontoDuracion() * 0.21;
	}
	
	public abstract double adicional();
	
	public double calcularMontoLlamada() {
		return this.calcularMontoDuracion() + 
			this.calcularDescuento() + this.adicional();
	}
}
