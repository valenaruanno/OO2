package ar.edu.unlp.objetos.dos.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	private Agua tAgua;
	private Agua tAgua2;
	private Tierra tTierra;
	private Tierra tTierra2;
	private Mixta tMixta;
	private Mixta tMixta2;
	
	@BeforeEach
	public void setUp() {
		this.tAgua = new Agua();
		this.tAgua2 = new Agua();
		this.tTierra = new Tierra();
		this.tTierra2 = new Tierra();
		this.tMixta = new Mixta ();
		this.tMixta.addTopografia(tAgua);
		this.tMixta.addTopografia(tTierra);
		this.tMixta.addTopografia(tAgua);
		this.tMixta.addTopografia(tTierra);
		this.tMixta2 = new Mixta ();
		this.tMixta2.addTopografia(tAgua);
		this.tMixta2.addTopografia(tTierra);
		this.tMixta2.addTopografia(tAgua);
		this.tMixta2.addTopografia(tTierra);
	}
	
	@Test
	public void proporcionEnAgua() {
		assertEquals(1,this.tAgua.proporcionAgua());
		assertEquals(0,this.tAgua.proporcionTierra());
	}
	
	@Test
	public void proporcionEnTierra() {
		assertEquals(0,this.tTierra.proporcionAgua());
		assertEquals(1,this.tTierra.proporcionTierra());
	}
	
	@Test
	public void proporcionEnMixta() {
		assertEquals(0.0,this.tMixta.proporcionAgua());
		assertEquals(1.0,this.tMixta.proporcionTierra());
	}
	
	@Test
	public void esIgualAgua() {
		assertTrue(this.tAgua.esIgual(tAgua2));
	}
	
	@Test
	public void esIgualTierra() {
		assertTrue(this.tTierra.esIgual(tTierra2));
	}
	
	@Test
	public void esIgualMixta() {
		assertTrue(this.tMixta.esIgual(tMixta2));
		assertFalse(this.tMixta.esIgual(tAgua));
		assertFalse(this.tMixta.esIgual(tTierra));
		this.tMixta.deleteTopografia();
		this.tMixta.addTopografia(tAgua);
		assertFalse(this.tMixta.esIgual(tMixta2));
	}
}
