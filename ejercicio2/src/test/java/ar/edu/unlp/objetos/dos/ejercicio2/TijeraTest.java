package ar.edu.unlp.objetos.dos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TijeraTest {
	private Tijera tijera1;
	private Tijera tijera2;
	private Papel papel;
	private Piedra piedra;
	
	@BeforeEach
	public void setUp () {
		tijera1 = new Tijera ("tijera");
		tijera2= new Tijera ("tijera");
		papel = new Papel ("papel");
		piedra = new Piedra ("piedra");
	}
	
	@Test
	public void pruebaEmpate () {
		assertEquals(null, tijera1.quienGana(tijera2));
	}
	
	@Test 
	public void pruebaGanaTijera () {
		assertEquals(tijera1, tijera1.quienGana(papel));
	}
	
	@Test 
	public void pruebaPierdeTijera () {
		assertEquals(piedra, tijera1.quienGana(piedra));
	}
}
