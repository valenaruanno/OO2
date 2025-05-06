package ar.edu.unlp.objetos.dos.ejercicio11;

public class Tierra extends Topografia{

	@Override
	public double proporcionAgua() {
		return 0;
	}

	@Override
	public boolean esIgualAgua() {
		return false;
	}

	@Override
	public boolean esIgualTierra() {
		return true;
	}

	@Override
	public boolean esIgualMixta(Mixta topografia) {
		return false;
	}

	@Override
	public boolean esIgualPantano() {
		return false;
	}

	@Override
	public boolean equals(Topografia topografia) {
		return topografia.esIgualTierra();
	}

}
