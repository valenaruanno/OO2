package ar.edu.unlp.info.oo2.ejercicio14;

public class Inmueble extends Prenda{
	private String direccion;
	private double superficie;
	private double costroM2;
	
	
	public Inmueble(String nombre, String direccion, double superficie, double costroM2) {
		super(nombre, 0.2);
		this.direccion = direccion;
		this.superficie = superficie;
		this.costroM2 = costroM2;
	}

	@Override
	public double calcularValor() {
		return this.superficie * this.costroM2;
	}
	
	
}
