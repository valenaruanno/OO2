package ar.edu.unlp.objetos.dos.ejercicio11;

public class Agua extends Topografia {

	@Override
	public int proporcionAgua() {
		return 1;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualAgua();
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
	public int proporcionTierra() {
		return 1 - this.proporcionAgua();
	}

}
