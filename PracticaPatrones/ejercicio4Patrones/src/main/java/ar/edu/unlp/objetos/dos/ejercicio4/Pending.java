package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State{
	
	public InProgress start() {
		InProgress inProgress = new InProgress();
		return inProgress;
	}
	
	public Pending togglePaused () {
		throw new RuntimeException("ToDoItem no se encuentra en estado InProgress o Paused");
	}
	
	public Duration workedTime (ToDoItem toDoItem) {
		throw new RuntimeException("La tarea no fue inicializada");

	}

}
