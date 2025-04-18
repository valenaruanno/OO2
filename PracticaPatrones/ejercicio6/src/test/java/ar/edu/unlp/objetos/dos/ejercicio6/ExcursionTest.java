package ar.edu.unlp.objetos.dos.ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	private Excursion excursion;
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;
	private Provisoria provisoria;
	private Definitiva definitiva;
	private Completa completa;
	
	@BeforeEach
	public void setUp() {
		provisoria = new Provisoria ();
		this.excursion = new Excursion ("Dos dias en kayak bajando el Parana", LocalDate.of(2025, 04, 18),
				LocalDate.of(2025, 04, 20), "Olavarria", 1000, 1, 2, provisoria);
		usuario1 = new Usuario ("valentin", "aruanno", "valentin@");
		usuario2 = new Usuario ("abril", "manzur", "abril@");
		usuario3 = new Usuario ("carolina", "di masi", "carolina@");
		definitiva = new Definitiva ();
		completa = new Completa ();
	}
	
	@Test
	public void estadoProvisorioTest() {
		assertEquals (this.provisoria, this.excursion.getEstado());
	}
	
	@Test
	public void agregarUsuario1Test () {
		this.excursion.inscribir(usuario1);
		assertTrue(this.excursion.getEstado() instanceof Definitiva);
	}
	
	@Test 
	public void agregarUsuario2Test () {
		this.excursion.inscribir(usuario1);
		this.excursion.inscribir(usuario2);
		assertTrue(this.excursion.getEstado() instanceof Completa);
	}
	
	@Test
	public void listaDeEsperaTest () {
		this.excursion.inscribir(usuario1);
		this.excursion.inscribir(usuario2);
		this.excursion.inscribir(usuario3);
		assertEquals(1, this.excursion.getListaEspera().size());
	}
}
