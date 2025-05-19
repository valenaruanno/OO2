package ar.edu.unlp.objetos.dos.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> topografias;
	
	public Mixta (List<Topografia> topografias) {
		this.topografias = topografias;
	}
	
	public List<Topografia> getTopografias() {
		return topografias;
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
	            .allMatch(i -> this.topografias.get(i).equals(topografia.getTopografias().get(i)));
	}

	@Override
	public boolean esIgualPantano() {
		return false;
	}

	@Override
	public double proporcionAgua() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionAgua()).sum() / 4;
	}

	@Override
	public boolean equals(Topografia topografia) {
		if (this.proporcionAgua() == topografia.proporcionAgua())
			return java.util.stream.IntStream.range(0, 4)
					.allMatch(i -> this.topografias.get(i).equals(((Mixta) topografia).getTopografias().get(i)));
		else 
			return false;
	}

}
