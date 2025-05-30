package ar.info.juego.Encriptador;

public class Mensajero {
	private Strategy strategy;
	
	public Mensajero (Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void enviar(String mensaje) {
		strategy.encrypt(mensaje);
	}
	
	public void recibir (String mensaje) {
		strategy.descript(mensaje);
	}
}
