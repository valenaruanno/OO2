package ar.info.juego.Encriptador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MensajeroTest {
	private Mensajero m;
	private FeistelCipher f;
	private RC4 r;
	private RC4Adapter rAdapter;
	private FeistelCipherAdapter fAdapter;
	
	
	@BeforeEach
	public void setUp() {
		f = new FeistelCipher ("1234");
		r = new RC4 ();
		
		rAdapter = new RC4Adapter (r, "1234");
		fAdapter = new FeistelCipherAdapter (f);
		
	}
	
	@Test
	public void RC4EnviarMensajeTest () {
		m = new Mensajero (fAdapter);
		m.enviar("Hola Soy Valentin Aruanno");
		m.setStrategy(rAdapter);
		m.enviar("Hola Soy Valentin Aruanno");
	}
}
