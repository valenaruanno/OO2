package ar.edu.unlp.info.oo2.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	private FileSystem fileSystem;
	private Directorio raiz;
	private Directorio carpeta;
	private Archivo archivo1;
	private Archivo archivo2;
	
	@BeforeEach
	public void setUp() {
		raiz = new Directorio ("raiz");
		fileSystem = new FileSystem(raiz);
		carpeta = new Directorio ("directorio1");
		archivo2 = new Archivo ("archivo1",300);
		archivo1 = new Archivo ("archivo1",200);
	}

	@Test
	public void tamañoTotalOcupadoTest() {
		raiz.addComponent(archivo1);
		raiz.addComponent(archivo2);
		assertEquals(32500, this.fileSystem.tamanioTotalOcupado());
	}
	
	@Test
	public void archivoMasGrandeTest() {
		raiz.addComponent(archivo1);
		raiz.addComponent(carpeta);
		carpeta.addComponent(archivo2);
		assertEquals(archivo2,this.fileSystem.archivoMasGrande());
	}
	
	@Test
	public void archivoMasNuevoTest() {
		raiz.addComponent(archivo1);
		raiz.addComponent(carpeta);
		carpeta.addComponent(archivo2);
		assertEquals(archivo1,this.fileSystem.archivoMasNuevo());
	}
	
	@Test
	public void buscarTest () {
		raiz.addComponent(archivo1);
		raiz.addComponent(carpeta);
		carpeta.addComponent(archivo2);
		assertEquals(archivo1,this.fileSystem.buscar("/archivo1"));
	}
	
	@Test
	public void buscarTodosTest() {
		raiz.addComponent(archivo1);
		raiz.addComponent(carpeta);
		carpeta.addComponent(archivo2);
		List<Raiz> todos = new ArrayList<>();
		todos.add(archivo2);
		todos.add(archivo1);
		assertEquals(todos,this.fileSystem.buscarTodos("/archivo1"));
	}
	
	@Test
	public void listadoDeContenido() {
		carpeta.addComponent(archivo1);
		carpeta.addComponent(archivo1);
		raiz.addComponent(carpeta);
		assertEquals("/raiz/directorio1/archivo1 \\n /raiz/directorio1/archivo1", this.fileSystem.listadoDeContenido("/"));
	}
}
