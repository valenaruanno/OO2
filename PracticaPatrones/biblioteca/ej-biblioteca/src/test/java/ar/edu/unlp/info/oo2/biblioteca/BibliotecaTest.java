package ar.edu.unlp.info.oo2.biblioteca;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	private Biblioteca biblioteca;
	private Socio s1;
	private Socio s2;
	
	@BeforeEach
	public void setUp() {
		biblioteca = new Biblioteca();
		s1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		s2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
	}

	@Test
	public void exportarSociosTestVacio() {
		assertEquals("[]", biblioteca.exportarSocios());
	}
	@Test
	public void exportarSociosTest () {
		biblioteca.agregarSocio(s1);
		biblioteca.agregarSocio(s2);
		String aux = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]";
		assertEquals(aux, biblioteca.exportarSocios());
	}
}
