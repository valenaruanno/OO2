package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Finished extends State{

	public Finished () {
		
	}
	
	@Override
	public State togglePaused() {
		throw new RuntimeException("ToDoItem no se encuentra en estado InProgress o Paused");
	}
	
	public Duration workedTime(ToDoItem toDoItem) {
		return Duration.between(toDoItem.getInicio(), toDoItem.getFin());
	}
	
	public void addComment (String comment, List<String> comments) {	
		
	}
}
