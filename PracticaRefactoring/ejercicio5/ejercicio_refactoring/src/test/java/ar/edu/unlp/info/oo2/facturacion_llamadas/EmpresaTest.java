package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;

	@BeforeEach
	public void setUp() {
		this.sistema = new Empresa();
		this.sistema.agregarNumeroTelefono("2214444554");
		this.sistema.agregarNumeroTelefono("2214444555");
		this.sistema.agregarNumeroTelefono("2214444556");
		this.sistema.agregarNumeroTelefono("2214444557");
		this.sistema.agregarNumeroTelefono("2214444558");
		this.sistema.agregarNumeroTelefono("2214444559");
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		Cliente emisorPersonaFisca = new ClienteFisica("Brendan Eich" , "11555666");
	    sistema.registrarUsuario(emisorPersonaFisca);
	    Cliente remitentePersonaFisica = new ClienteFisica("Doug Lea" , "00000001");
	    sistema.registrarUsuario(remitentePersonaFisica);
	    Cliente emisorPersonaJuridica = new ClienteJuridica("Nvidia Corp" , "17555222");
	    sistema.registrarUsuario(emisorPersonaJuridica);
	    Cliente remitentePersonaJuridica = new ClienteJuridica("Sun Microsystems" , "25765432");
	    sistema.registrarUsuario(remitentePersonaJuridica);

	    Llamada n1 = new LlamadaNacional("17555222", "00000001", 10);
	    this.sistema.registrarLlamada(emisorPersonaJuridica, n1);
	    Llamada i1 = new LlamadaInternacional("17555222", "00000001", 8);
	    this.sistema.registrarLlamada(emisorPersonaJuridica, i1);
	    Llamada n2 = new LlamadaNacional("17555222", "25765432", 5);
	    this.sistema.registrarLlamada(emisorPersonaJuridica, n2);
	    Llamada i2 = new LlamadaInternacional("17555222", "25765432", 7);
	    this.sistema.registrarLlamada(emisorPersonaJuridica, i2);
		this.sistema.registrarLlamada(emisorPersonaFisca, new LlamadaNacional(emisorPersonaFisca.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 15));
		this.sistema.registrarLlamada(emisorPersonaFisca, new LlamadaInternacional(emisorPersonaFisca.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 45));
		this.sistema.registrarLlamada(emisorPersonaFisca, new LlamadaNacional(emisorPersonaFisca.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 13));
		this.sistema.registrarLlamada(emisorPersonaFisca, new LlamadaInternacional(emisorPersonaFisca.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 17));

		assertEquals(11454.64, this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 0.01);
		assertEquals(2445.40, this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 0.01);
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica));
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica));
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.sistema.agregarNumeroTelefono("2214444558"); 
		Cliente nuevaPersona = this.sistema.registrarUsuario(new ClienteFisica("Alan Turing", "2444555"));

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		// por defecto es el ultimo
		assertEquals("2214444559", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador("primero");
		assertEquals("2214444554", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador("random");
		assertNotNull(this.sistema.obtenerNumeroLibre());
	}
}
