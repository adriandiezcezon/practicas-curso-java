package es.indra.aerolineas;

import java.util.ArrayList;
import java.util.Iterator;

public class Pasajero {

	int id;
	String dni;
	ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();	
	
	public Pasajero(int id, String dni) {
		
		this.id = id;
		this.dni = dni;
	
	}
	
	public void recorrerVuelos() {
		Iterator<Vuelo> it = vuelos.iterator();
		while(it.hasNext()){
			Vuelo elemento = it.next();
			System.out.println(elemento.id);
		}
	}
}