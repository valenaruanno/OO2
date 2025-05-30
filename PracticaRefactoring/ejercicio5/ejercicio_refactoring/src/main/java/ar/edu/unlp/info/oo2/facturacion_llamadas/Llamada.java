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
	
	protected double multiplicar() {
		return this.duracion * this.valor();
	}
	
	protected double porcentaje() {
		return this.multiplicar() *  0.21;
	}
	
	protected abstract double valor();
	
	protected abstract double adicional();
	
	public double calcularPrecioLlamada(){
		return this.multiplicar() + this.porcentaje() + this.adicional();
	}
	
}
