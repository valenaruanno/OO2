package ar.edu.unlp.objetos.dos.ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre;
	private LocalDate fechaDeInicio;
	private LocalDate fechaDeFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> listaInscriptos;
	private List<Usuario> listaEspera;
	private Estado estado;
	
	public Excursion (String nombre, LocalDate fechaDeInicio, LocalDate fechaDeFin, 
			String puntoDeEncuentro, double costo, int cupoMinimo, int cupoMaximo,
			Provisoria provisoria) {
		this.nombre = nombre;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado = provisoria;
		listaInscriptos = new ArrayList<>();
		listaEspera = new ArrayList<>();
	}
	
	public int getCupoMinimo() {
		return cupoMinimo;
	}

	
	public List<Usuario> getListaInscriptos() {
		return listaInscriptos;
	}

	public List<Usuario> getListaEspera (){
		return this.listaEspera;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public void setListaInscriptos(List<Usuario> listaInscriptos) {
		this.listaInscriptos = listaInscriptos;
	}

	public void inscribirUsuario (Usuario unUsuario) {
		this.listaInscriptos.add(unUsuario);
	}
	
	public void inscribir (Usuario unUsuario) {
		this.estado.manejarInscripcion(unUsuario, this); 
	}
	
	protected void setEstado (Estado estado) {
		this.estado = estado;
	}
	
	public boolean cupoInscriptosMinimoCompleto () {
		return this.listaInscriptos.size() == this.cupoMinimo;
	}
	
	public boolean cupoInscriptosMaximoCompleto () {
		return this.listaInscriptos.size() == this.cupoMaximo;
	}
	
	public int usuariosFaltantesCupoMinimo () {
		return this.cupoMinimo - this.listaInscriptos.size();
	}
	
	public int usuariosFaltantesCupoMaximo () {
		return this.cupoMaximo - this.listaInscriptos.size();
	}
	
	public void agregarUsuarioListaDeEspera (Usuario unUsuario) {
		this.listaEspera.add(unUsuario);
	}
	
	public String obtenerInformacion () {
		return this.estado.obtenerInformacion(this);
	}
	
	public String emailDeUsuariosInscriptos() {
	    return this.listaInscriptos.stream()
	               .map(u -> u.getEmail())
	               .collect(Collectors.joining(", "));
	}

	public String toString () {
		return "Nombre: " + this.nombre + 
				". Costo: " + this.costo + 
				". Fecha Inicio: " + this.fechaDeInicio + 
				". Fecha de fin: " + this.fechaDeFin +
				". Punto de encuentro: " + this.puntoDeEncuentro + ". ";
	}
}
