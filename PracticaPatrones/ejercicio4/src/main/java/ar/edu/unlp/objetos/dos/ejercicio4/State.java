package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public abstract class State {
	protected LocalDateTime fin;
	 
	
	public State start() {
		return this;
		
	}

	public abstract State togglePaused();

	public State finish(ToDoItem toDoItem) {
		return this;
	}
	
	public Duration workedTime(ToDoItem toDoItem) {
		return Duration.between(toDoItem.getInicio(), LocalDateTime.now());
	}
	
	public void addComment (String comment, ToDoItem toDoItem) {	
		comments.add(comment);
	}
}
