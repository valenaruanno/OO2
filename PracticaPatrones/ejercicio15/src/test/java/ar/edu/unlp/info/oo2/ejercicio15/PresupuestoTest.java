package ar.edu.unlp.info.oo2.ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PresupuestoTest {
	private Presupuesto p1;
	private Presupuesto p2;
	private Presupuesto p3;
	private Catalogo c;
	private ConstructorBasico basico;
	private ConstructorIntermedio intermedio;
	private ConstructorGamer gamer;
	private double consumo;
	
	@BeforeEach
	public void setUp() {
		this.gamer = new ConstructorGamer();
		this.basico = new ConstructorBasico();
		this.intermedio = new ConstructorIntermedio();
		
		this.p1 = new Presupuesto("Valentin", basico);
		this.p2 = new Presupuesto("Abril", intermedio);
		this.p3 = new Presupuesto("Carolina", gamer);
		this.c = new Catalogo();
	}
	
	@Test
	public void presupuestoEquipoBasico() {
		c.addComponent(new Componente ("Procesador basico", "Procesador basico", 1000, 300));
		c.addComponent(new Componente ("Memoria Ram", "8GB", 300, 100));
		c.addComponent(new Componente ("Disco", "HDD 500 GB", 200, 100));
		c.addComponent(new Componente ("Gabinete estandar", "Gabinete estandar", 100, 50));
		this.basico.setCatalogo(c);
		this.p1.Construir();
	}
	
	@Test
	public void presupuestoEquipoIntermedio() {
		c.addComponent(new Componente ("Procesador intermedio", "Procesador intermedio", 1000, 300));
		c.addComponent(new Componente ("Memoria Ram", "16GB", 300, 100));
		c.addComponent(new Componente ("Disco", "SSD 500 GB", 200, 100));
		c.addComponent(new Componente ("Tarjeta grafica", "GTX 1650", 700, 240));
		c.addComponent(new Componente ("Gabinete intermedio", "Gabinete intermedio", 100, 50));
		c.addComponent(new Componente ("Fuente", "Fuente 800w", 100, 50));
		this.intermedio.setCatalogo(c);
		this.p1.Construir();
	}
	
	@Test
	public void presupuestoEquipoGamer() {
		c.addComponent(new Componente ("Procesador gamer", "Procesador gamer", 1000, 300));
		c.addComponent(new Componente ("Pad termico", "Pad termico", 500, 150));
		c.addComponent(new Componente ("Cooler", "Cooler", 400, 150));
		c.addComponent(new Componente ("Memoria Ram", "32GB", 300, 100));
		c.addComponent(new Componente ("Memoria Ram", "32GB", 300, 100));
		c.addComponent(new Componente ("Disco", "SSD 500 GB", 200, 100));
		c.addComponent(new Componente ("Disco", "SSD 1 TB", 200, 100));
		c.addComponent(new Componente ("Tarjeta grafica", "RTX 4090", 700, 240));
		c.addComponent(new Componente ("Gabinete gamer", "Gabinete gamer", 100, 50));
		c.addComponent(new Componente ("Fuente", "Fuente 1835w", 100, 50));
		this.gamer.setCatalogo(c);
		this.p1.Construir();
	}
}
