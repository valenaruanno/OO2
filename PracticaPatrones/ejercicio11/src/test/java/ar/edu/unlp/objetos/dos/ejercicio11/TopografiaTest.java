package ar.edu.unlp.objetos.dos.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	private Agua tAgua;
	private Agua tAgua2;
	private Tierra tTierra;
	private Tierra tTierra2;
	private List<Topografia> listaMixta = new ArrayList<>();
	private List<Topografia> listatMixta2 = new ArrayList<>();
	private Mixta tMixta;
	private Mixta tMixta2;
	private List<Topografia> listatMixta3 = new ArrayList<>();
	private Mixta tMixta3;
	private Pantano tPantano;
	private Pantano tPantano2;
	
	@BeforeEach
	public void setUp() {
		this.tAgua = new Agua();
		this.tAgua2 = new Agua();
		this.tTierra = new Tierra();
		this.tTierra2 = new Tierra();
		this.listaMixta.add(tAgua);
		this.listaMixta.add(tTierra);
		this.listaMixta.add(tAgua);
		this.listaMixta.add(tTierra);
		this.tMixta = new Mixta (listaMixta);
		this.listatMixta2.add(tAgua);
		this.listatMixta2.add(tTierra);
		this.listatMixta2.add(tAgua);
		this.listatMixta2.add(tTierra);
		this.tMixta2 = new Mixta (listatMixta2);
		this.listatMixta3.add(tAgua);
		this.listatMixta3.add(tTierra);
		this.listatMixta3.add(tAgua);
		this.listatMixta3.add(tAgua);
		this.tMixta3 = new Mixta (listatMixta3);
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
		assertTrue(this.tAgua.equals(tAgua2));
	}
	
	@Test
	public void esIgualTierraTest() {
		assertTrue(this.tTierra.equals(tTierra2));
	}
	
	@Test
	public void esIgualMixtaTest() {
		assertTrue(this.tMixta.equals(tMixta2));
		assertFalse(this.tMixta.equals(tAgua));
		assertFalse(this.tMixta.equals(tTierra));
		assertFalse(this.tMixta.equals(tMixta3));
	}
	
	@Test
	public void esIgualPantanoTest() {
		assertTrue(this.tPantano.equals(tPantano2));
	}
	
	@Test
	public void equalsTest() {
		assertTrue(this.tMixta.equals(tMixta2));
		assertFalse(this.tMixta.equals(tAgua));
		assertFalse(this.tMixta.equals(tTierra));
		assertFalse(this.tMixta.equals(tMixta3));
	}
}
