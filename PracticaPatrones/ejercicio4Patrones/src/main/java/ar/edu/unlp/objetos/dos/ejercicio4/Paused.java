package ar.edu.unlp.objetos.dos.ejercicio4;

import java.time.LocalDateTime;

public class Paused extends State{

	@Override
	public State togglePaused() {
		InProgress inProgress = new InProgress ();
		return inProgress;
	}

	public State finish (ToDoItem toDoItem) {
		Finished finished = new Finished();
		toDoItem.setFin(LocalDateTime.now());
		return finished;
	}
	
}
