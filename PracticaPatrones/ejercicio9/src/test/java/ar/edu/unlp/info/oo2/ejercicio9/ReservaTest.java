package ar.edu.unlp.info.oo2.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {
	private Reserva reserva;
	private Usuario usuario;
	private AutoEnAlquiler auto;
	private Politica flexible;
	private Politica moderada;
	
	@BeforeEach
	public void setUp() {
		this.usuario = new Usuario ("Valentin");
		flexible = new PoliticaFlexible();
		this.auto = new AutoEnAlquiler(100, 4, "Ford", flexible);
		this.reserva = new Reserva (5, LocalDate.of(2025, 04, 30), this.auto, this.usuario);
	}
	
	@Test
	public void cancelacionFlexible() {
		assertEquals (this.reserva.montoAPagar(), this.reserva.montoAReembolsar(LocalDate.now()));
		System.out.println(this.reserva.montoAReembolsar(LocalDate.now()));
	}
	
	@Test
	public void cancelacionModerada() {
		this.moderada = new PoliticaModerada();
		this.auto.setPolitica(moderada);
		assertEquals (0, this.reserva.montoAReembolsar(LocalDate.now()));
		System.out.println(this.reserva.montoAReembolsar(LocalDate.now()));
	}
}
