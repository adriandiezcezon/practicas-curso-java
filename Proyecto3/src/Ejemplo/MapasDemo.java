package Ejemplo;

import java.util.HashMap;
import java.util.Map;

public class MapasDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String>estudiantes= new HashMap<>();
		
		estudiantes.put("Perez", "Andres");
		estudiantes.put("Perez2", "Andres");
		estudiantes.put("Perez3", "Andres");

		
		
		System.out.println(estudiantes.size()); 
			//si tenemos el mismo apellido devolvera 1, el apellido es la key en este caso
		
		for(Map.Entry<String, String> elemento : estudiantes.entrySet()) {
			System.out.println("Clave : " + elemento.getKey() + " y valor :" + elemento.getValue());
			
			
		}
	
		
	}
	
	


}
