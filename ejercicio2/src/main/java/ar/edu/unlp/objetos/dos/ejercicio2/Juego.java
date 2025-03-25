package ar.edu.unlp.objetos.dos.ejercicio2;

public class Juego {
	private Jugador jugador1;
	private Jugador jugador2;
	
	public Juego (Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	
	public String determinarGanador () {
		Opcion opcion = this.jugador1.getOpcion().quienGana(this.jugador2.getOpcion());
		if (opcion == null)
			return"empate";
		else 
			return opcion.getSoy();
	}
}
