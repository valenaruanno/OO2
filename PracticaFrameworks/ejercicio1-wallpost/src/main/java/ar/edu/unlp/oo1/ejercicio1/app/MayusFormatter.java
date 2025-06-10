package ar.edu.unlp.oo1.ejercicio1.app;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MayusFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		return String.format("[%s] %s%n", 
				record.getLevel(), 
				record.getMessage().toUpperCase());
	}

}
