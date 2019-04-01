package it.jaad.json;

import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONMarshall {

	private static final Logger Log = LoggerFactory.getLogger(JSONMarshall.class);
	
	public static void main(String[] args) {


		Programa programa = new Programa();
		programa.setCodigo(123);
		programa.setNombre("Java architect application Developer");

		List<String> modulos = new ArrayList<String>();
		modulos.add("fundamentos de comunicaicon");
		modulos.add("Architectura de web services ");
		programa.setModulos(modulos);
		
		
		programa.setFechaInicio(new GregorianCalendar(2017,8,16).getTime());
		programa.setFechaFin(new GregorianCalendar(2017,9,16).getTime());
		
		try {
			File programaJson = new File("programa.json");
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.INDENT_OUTPUT, true);
			mapper.writeValue(programaJson, programa);
			Log.info("Resultado:\n" + mapper.writeValueAsString(programa));
			
		} catch (Exception e) {
			Log.error("error al generar el archivo", e);
		}

		
	}

}
