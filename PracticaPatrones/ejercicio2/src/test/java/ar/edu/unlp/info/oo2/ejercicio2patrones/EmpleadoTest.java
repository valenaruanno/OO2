package ar.edu.unlp.info.oo2.ejercicio2patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	private EmpleadoTemporario eT;
	private EmpleadoPasante eP;
	private EmpleadoPlanta eDp;
	
	@BeforeEach
	public void setUp() {
		eP = new EmpleadoPasante (1);
		eT = new EmpleadoTemporario (1, true, 1);
		eDp = new EmpleadoPlanta (false, 1, LocalDate.of(2020,1,1));
	}
	
	@Test 
	public void empeadoPasanteTest() {
		assertEquals(19300, eP.sueldo());
	}
	
	@Test 
	public void empeadoPlantaTest() {
		assertEquals(54900, eDp.sueldo());
	}
	
	@Test 
	public void empeadoTemporarioTest() {
		assertEquals(24311, eT.sueldo());
	}
	
}
