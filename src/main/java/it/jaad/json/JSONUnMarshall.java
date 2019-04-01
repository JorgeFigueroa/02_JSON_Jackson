package it.jaad.json;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONUnMarshall {

	private static final Logger Log = LoggerFactory.getLogger(JSONUnMarshall.class);

	
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			File programaJson = new File("programa.json");
			Programa programa = mapper.readValue(programaJson, Programa.class);
			
			Log.info("Codigo: " + programa.getCodigo());
			Log.info("Codigo: " + programa.getNombre());
			Log.info("Codigo: " + programa.getFechaFin());
			Log.info("Codigo: " + programa.getFechaInicio());

		} catch (Exception e) {
			Log.error("error al generar el archivo", e);
		}

		
		
	}

}
