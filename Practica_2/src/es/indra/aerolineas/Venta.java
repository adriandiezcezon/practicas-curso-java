/**
 * 
 */
package es.indra.aerolineas;

/**
 * @author aula10
 *
 */
public class Venta {

	
	/**
	 * @param args
	 */
	
	  static void Asociar(Vuelo vuelo, Pasajero pasajero) {
		  
		pasajero.vuelos.add(vuelo);
	}
	  
	public static void main(String[] args) {
		
		Vuelo vuelo1 = new Vuelo(1234, "1234SP", "MAD", "BCN", 50, true);
		Vuelo vuelo2 = new Vuelo(12345, "1234SP", "MAD", "BCN", 50, true);
		Pasajero pasajero1 = new Pasajero(12, "2345678X");
		Asociar(vuelo1, pasajero1);
		Asociar(vuelo2, pasajero1);
		pasajero1.recorrerVuelos();
	

	}
	


}
