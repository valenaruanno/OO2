package ar.edu.unlp.objetos.dos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiedraTest {
	private Piedra piedra1;
	private Piedra piedra2;
	private Tijera tijera;
	private Papel papel;
	
	@BeforeEach
	public void setUp () {
		piedra1 = new Piedra ("piedra");
		piedra2= new Piedra ("piedra");
		tijera = new Tijera ("tijera");
		papel = new Papel ("papel");
	}
	
	@Test
	public void pruebaEmpate () {
		assertEquals(null, piedra1.quienGana(piedra2));
	}
	
	@Test 
	public void pruebaGanaPiedra () {
		assertEquals(piedra1, piedra1.quienGana(tijera));
	}
	
	@Test 
	public void pruebaPierdePiedra () {
		assertEquals(papel, piedra1.quienGana(papel));
	}
}
