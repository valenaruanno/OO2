package ar.edu.unlp.info.oo2.ejercicio14;

public abstract class Prenda extends PrendaComponent{
	private double liquidez;
	
	public Prenda(String nombre, double liquidez) {
		super(nombre, liquidez);
	}
	
	public abstract double calcularValor();
	
}
