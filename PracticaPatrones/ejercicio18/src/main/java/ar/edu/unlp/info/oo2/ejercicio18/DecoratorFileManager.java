package ar.edu.unlp.info.oo2.ejercicio18;

import java.time.LocalDate;

public class  DecoratorFileManager implements FileComponent {
	private FileComponent fileComponent;
	
	
	public DecoratorFileManager(FileComponent fileComponent) {
		this.fileComponent = fileComponent;
	}

	public DecoratorFileManager() {
		
	}
	
	public FileComponent getFileComponent() {
		return fileComponent;
	}


	@Override
	public String prettyPrint() {
		return this.fileComponent.prettyPrint();
	}

	@Override
	public String getNombre() {
		return this.fileComponent.getNombre();
	}

	@Override
	public String getExtension() {
		return this.fileComponent.getExtension();
	}

	@Override
	public String getTamaño() {
		return this.fileComponent.getTamaño();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.fileComponent.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.fileComponent.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.fileComponent.getPermisos();
	}

}
