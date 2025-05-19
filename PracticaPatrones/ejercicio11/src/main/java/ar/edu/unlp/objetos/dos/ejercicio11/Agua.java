package ar.edu.unlp.objetos.dos.ejercicio11;

public class Agua extends Topografia {

	@Override
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public boolean esIgualAgua() {
		return true;
	}

	@Override
	public boolean esIgualTierra() {
		return false;
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
		return topografia.esIgualAgua();
	}

}
