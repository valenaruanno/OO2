package ar.edu.unlp.info.oo2.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
	private Mamifero nala;
	private Mamifero melquiades;
	private Mamifero mufasa;
	private Mamifero alexa;
	private Mamifero elsa;
	private Mamifero scar;
	private Mamifero sarabi;
	private Mamifero anonimo;

	@BeforeEach
	void setUp() {
		nala = new MamiferoNullObject("Nala", "mamifero", LocalDate.of(2025, 01, 01));
		melquiades = new MamiferoNullObject("Melquiades", "mamifero", LocalDate.of(2025, 01, 01));
		mufasa = new MamiferoConcreto("Mufasa", "mamifero", LocalDate.of(2025, 01, 01));
		alexa = new MamiferoConcreto("Alexa", "mamifero", LocalDate.of(2025, 01, 01));
		elsa = new MamiferoNullObject("Elsa", "mamifero", LocalDate.of(2025, 01, 01));
		scar = new MamiferoNullObject("Scar", "mamifero", LocalDate.of(2025, 01, 01));
		sarabi = new MamiferoConcreto("Sarabi", "mamifero", LocalDate.of(2025, 01, 01));
		anonimo = new MamiferoNullObject("valen", "mamifero", LocalDate.of(2025, 01, 01));

		alexa.setPadre(mufasa);
		alexa.setMadre(sarabi);
		mufasa.setPadre(melquiades);
		mufasa.setMadre(nala);
		sarabi.setPadre(scar);
		sarabi.setMadre(elsa);
	}

	@Test
	void testAbuelaMaterna() {
		assertEquals(elsa, alexa.getAbuelaMaterna());
		assertNull(sarabi.getAbuelaMaterna());
		assertNull(elsa.getAbuelaMaterna());
	}

	@Test
	void testAbuelaPaterna() {
		assertEquals(nala, alexa.getAbuelaPaterna());
		assertNull(mufasa.getAbuelaPaterna());
		assertNull(nala.getAbuelaPaterna());
	}

	@Test
	void testAbueloMaterno() {
		assertEquals(scar, alexa.getAbueloMaterno());
		assertNull(sarabi.getAbueloMaterno());
		assertNull(scar.getAbueloMaterno());
	}

	@Test
	void testAbueloPaterno() {
		assertEquals(melquiades, alexa.getAbueloPaterno());
		assertNull(mufasa.getAbueloPaterno());
		assertNull(melquiades.getAbueloPaterno());
	}

	@Test
	void testEspecie() {
		anonimo.setEspecie("Panthera leo");
		assertEquals("Panthera leo", anonimo.getEspecie());
	}

	@Test
	void testIdentificador() {
		anonimo.setIdentificador("Nala");
		assertEquals("Nala", anonimo.getIdentificador());
	}

	@Test
	void testMadre() {
		anonimo.setMadre(alexa);
		assertEquals(alexa, anonimo.getMadre());
		assertNull(nala.getMadre());
	}

	@Test
	void testPadre() {
		anonimo.setPadre(mufasa);
		assertEquals(mufasa, anonimo.getPadre());
		assertNull(nala.getPadre());
	}

	@Test
	void testTieneComoAncestroA() {
		assertFalse(nala.tieneComoAncestroA(anonimo));
		assertFalse(mufasa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(alexa));
		assertTrue(alexa.tieneComoAncestroA(mufasa));
		assertTrue(alexa.tieneComoAncestroA(sarabi));
		assertTrue(alexa.tieneComoAncestroA(nala));
		assertTrue(alexa.tieneComoAncestroA(melquiades));
		assertTrue(alexa.tieneComoAncestroA(elsa));
		assertTrue(alexa.tieneComoAncestroA(scar));
	}

	@Test
	void testTieneComoAncestroAsimetrico() {
		// Alice -> Aaron -> Anna -> Alexander
		Mamifero alice = new MamiferoNullObject("Alice", "mamifero", LocalDate.of(2025, 01, 01));
		Mamifero aaron = new MamiferoNullObject("Aaron", "mamifero", LocalDate.of(2025, 01, 01));
		Mamifero anna = new MamiferoNullObject("Anna", "mamifero", LocalDate.of(2025, 01, 01));
		Mamifero alexander = new MamiferoNullObject("Alexander", "mamifero", LocalDate.of(2025, 01, 01));

		alice.setPadre(aaron);
		aaron.setMadre(anna);
		anna.setPadre(alexander);

		assertTrue(alice.tieneComoAncestroA(aaron));
		assertTrue(alice.tieneComoAncestroA(alexander));
		assertTrue(alice.tieneComoAncestroA(anna));
		assertFalse(alice.tieneComoAncestroA(nala));
		assertFalse(alice.tieneComoAncestroA(alice));
	}
}
