package MediaCatalogue.app;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import MediaCatalogue.controller.*;
import MediaCatalogue.model.*;

public class Application {
	
	//The application class reads the json data file and maps it to the catalogue ogject.
	//The controller object takes in the catalogue object.
	
	public static void main (String [] args) {
		
		ObjectMapper mapper1 = new ObjectMapper(); 
		Catalogue catalogue = new Catalogue();
		try {
			catalogue = mapper1.readValue(new File("data.json"), Catalogue.class);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		AppController ac = new AppController(catalogue);
		ac.initController();
		
		
	}

	}
