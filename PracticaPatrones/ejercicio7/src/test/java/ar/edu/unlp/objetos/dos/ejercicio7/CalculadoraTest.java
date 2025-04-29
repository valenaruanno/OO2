package ar.edu.unlp.objetos.dos.ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private Calculadora calculadora;
	
	
	@BeforeEach
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void getResultadoEstadoInicialTest () {
		assertEquals("0.0", this.calculadora.getResultado());
	}
	
	@Test 
	public void getResultadoEstadoResolviendoTest() {
		this.calculadora.setValor(5);
		this.calculadora.mas();
		this.calculadora.setValor(3);
		//assertEquals("8.0", this.calculadora.getResultado());
		System.out.println(calculadora.getResultado()); // Imprimirá "8.0"
		this.calculadora.por();
		this.calculadora.setValor(2);
		//assertEquals("16.0", this.calculadora.getResultado());
		System.out.println(calculadora.getResultado()); // Imprimirá "16.0"
		this.calculadora.dividido();
		this.calculadora.setValor(2);
		//assertEquals("8.0", this.calculadora.getResultado());
		System.out.println(calculadora.getResultado()); // Imprimirá "8.0"
		this.calculadora.menos();
		this.calculadora.setValor(3);
		//assertEquals("5.0", this.calculadora.getResultado());
		System.out.println(calculadora.getResultado()); // Imprimirá "5.0"
	}
	
	@Test
	public void getResultadoEstadoErrorTest () {
		this.calculadora.setEstado(new Error());
		assertEquals("Error", this.calculadora.getResultado());
	}
	
	@Test
	public void borrar() {
		this.calculadora.borrar();
		assertEquals(0.0, this.calculadora.getValorAcumulado());
		assertTrue(this.calculadora.getEstado() instanceof Inicial);
		this.calculadora.setValor(5);
		this.calculadora.borrar();
		assertEquals(0.0, this.calculadora.getValorAcumulado());
		assertTrue(this.calculadora.getEstado() instanceof Inicial);
		this.calculadora.setEstado(new Error());
		this.calculadora.borrar();
		assertEquals(0.0, this.calculadora.getValorAcumulado());
		assertTrue(this.calculadora.getEstado() instanceof Inicial);
	}
	
	@Test
	public void dividirPor0() {
		this.calculadora.setValor(10);
		this.calculadora.dividido();
		this.calculadora.setValor(0);
		assertEquals("Error", this.calculadora.getResultado());
		assertTrue(this.calculadora.getEstado() instanceof Error);
	}

}
