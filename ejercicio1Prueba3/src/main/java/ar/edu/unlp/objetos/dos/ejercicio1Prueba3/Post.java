package ar.edu.unlp.objetos.dos.ejercicio1Prueba3;

import java.util.ArrayList;
import java.util.List;

public class Post {
	private Usuario usuario;
	private List <Retweet> retweets;
	
	public Post (Usuario usuario){
		this.usuario = usuario;
		this.retweets = new ArrayList <> ();
	}
	
	public void agregarRetweet (Retweet retweet) {
		this.retweets.add(retweet);
	}
	
	private void eliminarRetweets () {
		this.retweets.clear();
	}
	
	public void eliminarReferencias() {
		this.retweets.stream().forEach(retweet -> retweet.getUsuario().eliminarRetweet(retweet));
		this.eliminarRetweets();
	}
	
	public Usuario getUsuario () {
		return this.usuario;
	}
}
