package ar.edu.unlp.info.oo2.ejercicio18;

public class Nombre extends DecoratorFileManager {
	

	public Nombre(FileComponent fileComponent) {
		super(fileComponent);
	}
	
	@Override
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + " - " + this.getNombre();
	}
}
