/**
 * 
 */
package es.indra.aerolineas.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author aula12
 *
 */
public class ReadFile {
	
	public List<String> retomarVuelos() throws ErrorLecturaDeVuelosException {
		
		List<String> vuelos=new ArrayList<>();
		Path path = Paths.get("c:/Users/aula10/practicas-curso-java/vuelos.txt");
		
		try {
			/*List<String>contenido = Files.readAllLines(path);
			
			int i=0;
			
			for(i=0;i<contenido.size();i++) {
				
					
				i++;
				
				//System.out.println(" \n");
				
			*/	
			
			vuelos=Files.readAllLines(path);
			//return Files.readAllLines(path);
			System.out.println(vuelos);	
			return vuelos;
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ErrorLecturaDeVuelosException("Fallo leyendo el archivo");
			//e.printStackTrace();
		} finally {
			System.out.println("Fin lectura archivos");
			}
	}
	
	
	
	public List<String> retornarVuelosPropagandoError() throws IOException {
		
		List<String> vuelos=new ArrayList<>();
		Path path = Paths.get("c:/Users/aula10/practicas-curso-java/vuelos.txt");
		vuelos=Files.readAllLines(path);

		return vuelos;
	}
	
	
	
	

}
