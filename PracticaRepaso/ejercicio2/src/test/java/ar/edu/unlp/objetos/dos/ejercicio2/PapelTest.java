package ar.edu.unlp.objetos.dos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PapelTest {
	private Papel papel1;
	private Papel papel2;
	private Tijera tijera;
	private Piedra piedra;
	
	@BeforeEach
	public void setUp () {
		papel1 = new Papel ("papel");
		papel2= new Papel ("papel");
		tijera = new Tijera ("tijera");
		piedra = new Piedra ("piedra");
	}
	
	@Test
	public void pruebaEmpate () {
		assertEquals(null, papel1.quienGana(papel2));
	}
	
	@Test 
	public void pruebaGanaPapel () {
		assertEquals(papel1, papel1.quienGana(piedra));
	}
	
	@Test 
	public void pruebaPierdePapel () {
		assertEquals(tijera, papel1.quienGana(tijera));
	}
}
