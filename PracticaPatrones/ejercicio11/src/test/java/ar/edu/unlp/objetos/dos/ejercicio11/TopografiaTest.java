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
	private Pantano tPantano;
	private Pantano tPantano2;
	
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
		this.tPantano = new Pantano ();
		this.tPantano2 = new Pantano();
	}
	
	@Test
	public void proporcionEnAguaTest() {
		assertEquals(1,this.tAgua.proporcionAgua());
		assertEquals(0,this.tAgua.proporcionTierra());
	}
	
	@Test
	public void proporcionEnTierraTest() {
		assertEquals(0,this.tTierra.proporcionAgua());
		assertEquals(1,this.tTierra.proporcionTierra());
	}
	
	@Test
	public void proporcionEnMixtaTest() {
		assertEquals(0.5,this.tMixta.proporcionAgua());
		assertEquals(0.5,this.tMixta.proporcionTierra());
	}
	
	@Test
	public void proporcionEnPantanoTest() {
		assertEquals(0.7, this.tPantano.proporcionAgua());
		assertEquals(0.3, this.tPantano.proporcionTierra());
	}
	
	@Test
	public void esIgualAguaTest() {
		assertTrue(this.tAgua.esIgual(tAgua2));
	}
	
	@Test
	public void esIgualTierraTest() {
		assertTrue(this.tTierra.esIgual(tTierra2));
	}
	
	@Test
	public void esIgualMixtaTest() {
		assertTrue(this.tMixta.esIgual(tMixta2));
		assertFalse(this.tMixta.esIgual(tAgua));
		assertFalse(this.tMixta.esIgual(tTierra));
		this.tMixta.deleteTopografia();
		this.tMixta.addTopografia(tAgua);
		assertFalse(this.tMixta.esIgual(tMixta2));
	}
	
	@Test
	public void esIgualPantanoTest() {
		assertTrue(this.tPantano.esIgual(tPantano2));
	}
}
