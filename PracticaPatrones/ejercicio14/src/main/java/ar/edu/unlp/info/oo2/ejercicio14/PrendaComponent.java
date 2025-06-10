package ar.edu.unlp.info.oo2.ejercicio14;

public abstract class PrendaComponent {
	private String nombre;
	private double liquidez;
	
	public PrendaComponent (String nombre, double liquidez) {
		this.nombre = nombre;
		this.liquidez = liquidez;
	}
	public abstract double calcularValor();
	
	public double calcularValorPrendario() {
		return this.calcularValor() * this.liquidez;
	}

}
