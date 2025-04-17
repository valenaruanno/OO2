package ar.edu.unlp.info.oo2.biblioteca;
import ar.edu.unlp.info.oo2.biblioteca.Socio;
import ar.edu.unlp.info.oo2.biblioteca.VoorheesExporter;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonAdapter extends VoorheesExporter {
	
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
		String sms;
		try {
			sms = mapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			sms = "[]";
		}
		return sms;
	}
}
