package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private State state;
	private List<String> comments;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		comments = new ArrayList<>();
	}
	
	protected void setState(State state) {
		this.state = state;
	}
	
	public void Start() {
		this.setState(this.state.start());
		this.inicio = LocalDateTime.now();
		
	}
	
	public void togglePaused() {
		this.setState(this.state.togglePaused());
	}
	
	public void finish() {
		this.setState(this.state.finish());
	}
	
	
	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public Duration workedTime() {
		return this.state.workedTime(this);
	}
	
	public void addComment (String comment) {
		this.state.addComment(comment, this);
	}
}
