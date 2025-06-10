package ar.edu.unlp.info.oo2.ejercicio18;

public class Extension extends DecoratorFileManager {

	public Extension(FileComponent fileComponent) {
		super(fileComponent);
		// TODO Auto-generated constructor stub
	}

	public Extension() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return this.getFileComponent().prettyPrint() + " - " + this.getExtension();
	}
	
}
