package ar.edu.unlp.info.ej1;

public class Tweet extends Post {
	private String texto;
	
	public Tweet (Usuario usuario, String texto) {
		super(usuario);
		this.texto = texto;
	}
}
