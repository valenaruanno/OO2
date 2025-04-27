package ar.edu.unlp.objetos.dos.ejercicio8;

public class Device {
	private Ringer ringer;
	private Display display;
	private Calculator calculator;
	private Connection connection;
	
	public Device (Ringer ringer, Display display, Connection connection) {
		this.ringer = ringer;
		this.display = display;
		this.calculator = new CRC16_Calculator();
		this.connection = connection;
	}
	
	public String send (String data) {
		return this.connection.sendData(data, this.calculator.crcFor(data));
	}
	
	public void conectWith (Connection connection) {
		this.connection = connection;
		this.display.showBanner(connection.pict());
		this.ringer.ring();
	}
	
	public void crcConfiguration (Calculator calculator) {
		this.calculator = calculator;
	}

	public Connection getConnection() {
		return connection;
	}

	public Calculator getCalculator() {
		return calculator;
	}
	
	
}
