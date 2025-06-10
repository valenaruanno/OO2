package ar.edu.unlp.info.oo2.ejercicio18;

public class Tamaño extends DecoratorFileManager{

	public Tamaño(FileComponent fileComponent) {
		super(fileComponent);
	}
	
	@Override
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + " - " + this.getTamaño();
	}
}
