package ar.edu.unlp.objetos.dos.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> topografias;
	
	public Mixta () {
		this.topografias = new ArrayList<>();
	}
	
	public void addTopografia(Topografia topografia) {
		if (topografias.size() < 4)
			this.topografias.add(topografia);
	}
	
	public void deleteTopografia() {
		this.topografias.remove(this.topografias.size() -1);
	}
	
	public List<Topografia> getTopografias() {
		return topografias;
	}

	
	@Override
	public double proporcionTierra() {
		return 1 - this.proporcionAgua();
	}
	
	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualMixta(this);
	}

	@Override
	public boolean esIgualAgua() {
		return false;
	}

	@Override
	public boolean esIgualTierra() {
		return false;
	}

	@Override
	public boolean esIgualMixta(Mixta topografia) {
		return java.util.stream.IntStream.range(0, 4)
	            .allMatch(i -> this.topografias.get(i).esIgual(topografia.getTopografias().get(i)));
	}

	@Override
	public boolean esIgualPantano() {
		return false;
	}

	@Override
	public double proporcionAgua() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionAgua()).sum() / 4;
	}

}
