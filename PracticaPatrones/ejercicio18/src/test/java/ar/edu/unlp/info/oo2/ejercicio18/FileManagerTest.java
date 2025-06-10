package ar.edu.unlp.info.oo2.ejercicio18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileManagerTest {
	private FileManager f;
	private FileOO2 fileOO2;
	private Nombre nombre;
	private DecoratorFileManager extension;
	private DecoratorFileManager fechaCreacion;
	private DecoratorFileManager tamaño;
	private DecoratorFileManager permisos;
	
	@BeforeEach
	public void setUp() {
		this.f = new FileManager();
		this.fileOO2 = new FileOO2("fileOO2", ".hola", "10B", LocalDate.now(), LocalDate.now(), "123");
	}
	
	@Test
	public void prueba1Test() {
		extension = new Extension(fileOO2);
		assertEquals("fileOO2 - .hola", this.extension.prettyPrint());
	}
	
	@Test
	public void prueba2Test() {
		fechaCreacion = new FechaCreacion(fileOO2);
		extension = new Extension(fechaCreacion);
		assertEquals("fileOO2 - 2025-06-03 - .hola", this.extension.prettyPrint());
	}
	
	@Test
	public void prueba3Test() {
		tamaño = new Tamaño (fileOO2);
		permisos = new Permisos (tamaño);
		extension = new Extension(permisos);
		assertEquals("fileOO2 - 10B - 123 - .hola", this.extension.prettyPrint());
	}
}
