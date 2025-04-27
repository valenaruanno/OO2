package ar.edu.unlp.objetos.dos.ejercicio8;

public class Connection4gAdapter implements Connection {
	private Connection4G connection4G;
	
	public Connection4gAdapter() {
		this.connection4G = new Connection4G();
	}
	@Override
	public String sendData(String data, int crc) {
		return this.connection4G.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.connection4G.getSymb();
	}

}
