/**
 * 
 */
package es.indra.aerolineas;

/**
 * @author aula10
 *
 */
public class Vuelo {

	int id;
	String num;
	String origen;
	String destino;
	int numeroPasajeros;
	boolean disponible;
	
	public Vuelo(int id, String num, String origen, String destino, int numeroPasajeros, boolean disponible) {
		super();
		this.id = id;
		this.num = num;
		this.origen = origen;
		this.destino = destino;
		this.numeroPasajeros = numeroPasajeros;
		this.disponible = disponible;
	}	
}
