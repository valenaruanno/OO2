package ar.edu.unlp.objetos.dos.ejercicio6;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario (String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	
}
