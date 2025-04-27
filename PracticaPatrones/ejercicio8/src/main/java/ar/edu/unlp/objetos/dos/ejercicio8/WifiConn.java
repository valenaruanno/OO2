package ar.edu.unlp.objetos.dos.ejercicio8;

public class WifiConn implements Connection {
	private String pict;
	
	public WifiConn () {
		this.pict = "WIFI";
	}
	
	@Override
	public String sendData(String data, int crc) {
		return this.pict + ": " + data + ". " + crc;
	}

	@Override
	public String pict() {
		return this.pict;
	}


}
