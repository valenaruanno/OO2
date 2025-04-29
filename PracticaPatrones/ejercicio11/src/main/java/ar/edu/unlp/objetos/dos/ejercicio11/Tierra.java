package ar.edu.unlp.objetos.dos.ejercicio11;

public class Tierra extends Topografia{

	@Override
	public int proporcionAgua() {
		return 0;
	}

	@Override
	public int proporcionTierra() {
		return 1 - this.proporcionAgua();
	}
	
	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualTierra();
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

}
