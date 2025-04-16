package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends State{

	@Override
	public State togglePaused() {
		Paused paused = new Paused ();
		return paused;
	}
	
	public State finish(ToDoItem toDoItem) {
		Finished finished = new Finished();
		toDoItem.setFin(LocalDateTime.now());
		return finished;
	}

}
