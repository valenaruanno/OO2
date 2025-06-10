package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.impl.WallPostImpl;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		// Configurar logger del modelo
				Logger modelLogger = Logger.getLogger(WallPostImpl.class.getName());
				FileHandler modelFileHandler = new FileHandler("model.log", true);
				//modelFileHandler.setFormatter(new SimpleFormatter());
				modelFileHandler.setFormatter(new MayusFormatter());
				modelLogger.addHandler(modelFileHandler);
				modelLogger.setUseParentHandlers(false);

				// Configurar logger de la interfaz
				Logger uiLogger = Logger.getLogger(WallPostUI.class.getName());
				FileHandler uiFileHandler = new FileHandler("ui.log", true);
				uiFileHandler.setFormatter(new SimpleFormatter());
				uiLogger.addHandler(uiFileHandler);
				uiLogger.setUseParentHandlers(false);
				uiLogger.info("Aplicación iniciada");
				
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
