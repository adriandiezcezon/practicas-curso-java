/**
 * 
 */
package es.indra.Practica1;

/**
 * @author aula10
 *
 */
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = "Hola, soy...";
		String cadena2 = "Eduardo García";
		
		StringBuilder sb = new StringBuilder();
		sb.append(cadena1);
		sb.append(" ");
		sb.append(cadena2);
		
		System.out.println(sb.length());
		System.out.println(sb.toString());
		
		System.out.println(cadena1.equals(cadena2) ? "Verdadero" : "Falso");   //Con equals comparas valores y con == comparas direcciones de memoria 
	}
	
}
