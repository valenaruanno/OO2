package ar.edu.unlp.info.oo2.ejercicio18;

public class Permisos extends DecoratorFileManager {

	public Permisos(FileComponent fileComponent) {
		super(fileComponent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + " - " + this.getPermisos();
	}
}
