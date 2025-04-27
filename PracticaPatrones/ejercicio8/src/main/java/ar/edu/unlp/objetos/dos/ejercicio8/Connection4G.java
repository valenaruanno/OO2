package ar.edu.unlp.objetos.dos.ejercicio8;

public class Connection4G {
	private String symb;
	
	public Connection4G() {
		this.symb = "4G";
	}
	
	public String transmit(String data, int crc) {
		return this.symb + ": " + data + ". " + crc;
	}

	public String getSymb() {
		return this.symb;
	}

}
