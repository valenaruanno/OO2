package ar.edu.unlp.objetos.dos.ejercicio11;

public abstract class Topografia {
	
	public abstract double proporcionAgua();
	public abstract boolean esIgualAgua ();
	public abstract boolean esIgualTierra ();
	public abstract boolean esIgualMixta (Mixta topografia);
	public abstract boolean esIgualPantano();	
	public abstract boolean equals(Topografia topografia);
	
	public  double proporcionTierra() {
		return 1 - this.proporcionAgua();
	}
}
