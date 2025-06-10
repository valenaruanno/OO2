package ar.edu.unlp.info.oo2.ejercicio18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {
	private List<FileComponent> files;
	
	public FileManager() {
		this.files = new ArrayList<>();
	}
	
	public void addFiles (FileComponent file) {
		this.files.add(file);
	}
	
	public String prettyPrint () {
		return this.files.stream().map(f -> f.prettyPrint()).collect(Collectors.joining("-"));
	}
}
