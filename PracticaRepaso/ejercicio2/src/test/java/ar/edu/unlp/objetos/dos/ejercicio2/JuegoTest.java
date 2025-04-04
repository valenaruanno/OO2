package ar.edu.unlp.objetos.dos.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
	private Juego juego;
	private Jugador jugador1;
	private Jugador jugador2;
	private Piedra piedra;
	private Papel papel;
	private Tijera tijera;
	
	@BeforeEach
	public void setUp () {
		piedra = new Piedra ("piedra");
		papel = new Papel ("papel");
		tijera = new Tijera ("tijera");
	}
	
	@Test
	public void ganaJugador1 () {
		jugador1 = new Jugador (piedra);
		jugador2 = new Jugador (tijera);
		juego = new Juego (jugador1, jugador2);
		assertEquals("piedra", juego.determinarGanador());
	}
	
	@Test
	public void empate () {
		jugador1 = new Jugador (piedra);
		jugador2 = new Jugador (piedra);
		juego = new Juego (jugador1, jugador2);
		assertEquals("empate", juego.determinarGanador());
	}
	
	@Test
	public void ganaJugador2 () {
		jugador1 = new Jugador (piedra);
		jugador2 = new Jugador (papel);
		juego = new Juego (jugador1, jugador2);
		assertEquals("papel", juego.determinarGanador());
	}
}
