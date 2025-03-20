package ar.edu.unlp.info.ej1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios = new ArrayList<>();
	
	public Twitter () {
		
	}
	
	private boolean existeUsuario(String nombre) {
		return this.usuarios.stream().anyMatch(usuario -> usuario.getScreenName().equals(nombre));
	}
	
	public void agregarUsuario(Usuario usuario) {
		if (!existeUsuario(usuario.getScreenName()))
			this.usuarios.add(usuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminarPosts();
		this.usuarios.remove(usuario);
	}
}
