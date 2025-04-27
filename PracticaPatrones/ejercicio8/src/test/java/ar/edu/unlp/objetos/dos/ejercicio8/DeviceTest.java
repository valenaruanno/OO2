package ar.edu.unlp.objetos.dos.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeviceTest {
	private Device device;
	private Ringer ringer;
	private Display display;
	private Connection wifiConn;
	private Connection conection4GAdapter;
	private CRC32_Calculator crc32;
	
	@BeforeEach
	public void setUp() {
		ringer = new Ringer();
		display = new Display();
		wifiConn = new WifiConn();
		this.device = new Device(ringer, display, wifiConn);
		this.conection4GAdapter = new Connection4gAdapter();
	}
	
	@Test
	public void sendTest() {
		assertEquals("WIFI: chau. 25133", this.device.send("chau"));
		this.device.conectWith(this.conection4GAdapter);
		assertEquals("4G: hola. 56651", this.device.send("hola"));
	}
	
	@Test
	public void connectWithTest() {
		this.device.conectWith(this.conection4GAdapter);
		assertTrue(this.device.getConnection() instanceof Connection4gAdapter);
	}
	
	@Test
	public void configurationCrcTest() {
		this.crc32 = new CRC32_Calculator();
		assertTrue(this.device.getCalculator() instanceof CRC16_Calculator);
		this.device.crcConfiguration(crc32);
		assertTrue(this.device.getCalculator() instanceof CRC32_Calculator);
		
	}
}
