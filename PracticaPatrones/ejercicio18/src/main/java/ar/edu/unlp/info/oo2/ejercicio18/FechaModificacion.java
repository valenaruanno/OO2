package ar.edu.unlp.info.oo2.ejercicio18;

public class FechaModificacion extends DecoratorFileManager {

	public FechaModificacion(FileComponent fileComponent) {
		super(fileComponent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + " - " + this.getFechaModificacion();
	}
}
