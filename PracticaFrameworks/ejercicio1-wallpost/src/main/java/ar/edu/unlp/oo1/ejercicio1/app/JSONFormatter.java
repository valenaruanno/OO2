package ar.edu.unlp.oo1.ejercicio1.app;

import java.util.logging.Formatter;

import java.util.logging.LogRecord;
import org.json.JSONObject;

public class JSONFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		JSONObject obj = new JSONObject();
        obj.put("message", record.getMessage());
        obj.put("level", record.getLevel());
        return obj.toString();
	}

}
