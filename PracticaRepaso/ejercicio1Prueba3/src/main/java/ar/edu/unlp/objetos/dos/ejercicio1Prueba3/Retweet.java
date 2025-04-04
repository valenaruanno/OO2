package ar.edu.unlp.objetos.dos.ejercicio1Prueba3;

public class Retweet extends Post{
	private Tweet origen;
	
	public Retweet (Tweet tweet) {
		super (tweet.getUsuario());
		this.origen = tweet;
	}
}
