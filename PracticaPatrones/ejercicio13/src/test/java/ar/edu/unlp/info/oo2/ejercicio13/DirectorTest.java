package ar.edu.unlp.info.oo2.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorTest {
	private Director director;
	private ConcreteBuilderSandwich builder;
	
	@BeforeEach
	public void setUp() {
		this.builder = new ConcreteBuilderSandwich();
		this.director = new Director(this.builder);
	}
	
	@Test
	public void crearSandwichClasico() {
		this.director.construirClasico("Pan brioche", "mayonesa", "Carne ternera", "Tomate");
		assertEquals(500.00, this.director.getBuilder().getResult().getPrecio());
	}
	
	@Test
	public void crearSandwichVegetariano() {
		this.director.construirVegetariano("Pan con semillas", "Provoleta grillada", "Berenjenas");
		assertEquals(420.00, this.director.getBuilder().getResult().getPrecio());
	}
	
	@Test
	public void crearSandwichVegano() {
		this.director.construirVegano("Pan integral", "Salsa criolla", "Milanesa de girgolas");
		assertEquals(620.00, this.director.getBuilder().getResult().getPrecio());
	}
	
	@Test
	public void crearSandwichSinTACC() {
		this.director.construirSinTACC("Pan de chipa", "Salsa tartara", "Carne de pollo", "Verduras grilladas");
		assertEquals(618.00, this.director.getBuilder().getResult().getPrecio());
	}
}
