package ar.edu.unlp.objetos.dos.ejercicio11;

public abstract class Topografia {
	
	public abstract double proporcionAgua();
	public abstract double proporcionTierra();
	public abstract boolean esIgual (Topografia topografia);
	public abstract boolean esIgualAgua ();
	public abstract boolean esIgualTierra ();
	public abstract boolean esIgualMixta (Mixta topografia);
	public abstract boolean esIgualPantano();	
}
