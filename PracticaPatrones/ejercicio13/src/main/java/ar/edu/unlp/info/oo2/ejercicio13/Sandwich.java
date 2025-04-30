package ar.edu.unlp.info.oo2.ejercicio13;

public class Sandwich {
	private String pan;
	private String aderezo;
	private String principal;
	private String adicional;
	private double precio;
	
	public Sandwich () {
		this.precio = 0;
	}
	
	public void incrementPrecio(int increment) {
		this.precio += increment;
	}
	
	public void setPan(String pan) {
		this.pan = pan;
	}
	public void setAderezo(String aderezo) {
		this.aderezo = aderezo;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public double getPrecio() {
		return precio;
	}
	
	
}
