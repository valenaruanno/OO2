package ar.edu.unlp.objetos.dos.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula rocky;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rambo;
	private SugerenciaSimilaridad sugerenciaSimilaridad;
	private SugerenciaPuntaje sugerenciaPuntaje;
	
	@BeforeEach
	public void setUp() {
		this.decodificador = new Decodificador ();
		LocalDate fecha;
		fecha = LocalDate.of(2007, 1, 1);
		this.thor = new Pelicula ("Thor", fecha, 7.9);
		fecha = LocalDate.of(2016, 1, 1);
		this.capitanAmerica = new Pelicula ("Capitan America", fecha, 7.8);
		fecha = LocalDate.of(2010, 1, 1);
		this.ironMan = new Pelicula ("Iron Man", fecha, 7.9);
		fecha = LocalDate.of(2017, 1, 1);
		this.dunkirk = new Pelicula ("Dunkirk", fecha, 7.9);
		fecha = LocalDate.of(1976, 1, 1);
		this.rocky = new Pelicula ("Rocky", fecha, 8.1);
		fecha = LocalDate.of(1979, 1, 1);
		this.rambo = new Pelicula ("Rambo", fecha, 7.8);
		
		thor.agregarSimilar(capitanAmerica);
		thor.agregarSimilar(ironMan);
		capitanAmerica.agregarSimilar(thor);
		capitanAmerica.agregarSimilar(ironMan);
		ironMan.agregarSimilar(thor);
		ironMan.agregarSimilar(capitanAmerica);
		rocky.agregarSimilar(rambo);
		rambo.agregarSimilar(rocky);
		
		sugerenciaSimilaridad = new SugerenciaSimilaridad();
		sugerenciaPuntaje = new SugerenciaPuntaje();
	}
	
	@Test
	public void sugerenciaSimilaridadTest() {
		List<Pelicula> test = new ArrayList<>();
		test.add(this.capitanAmerica);
		test.add(this.ironMan);
		test.add(this.rambo);
		this.decodificador.setCriterio(sugerenciaSimilaridad);
		assertEquals(test, this.decodificador.sugerir());
	}

	@Test
	public void sugerenciaPuntajeTest() {
		List<Pelicula> test = new ArrayList<>();
		test.add(this.dunkirk);
		test.add(this.ironMan);
		test.add(this.capitanAmerica);
		this.decodificador.setCriterio(sugerenciaPuntaje);
		assertEquals(test, this.decodificador.sugerir());
	}
	
}
