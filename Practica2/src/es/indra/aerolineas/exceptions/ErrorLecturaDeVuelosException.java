package es.indra.aerolineas.exceptions;

public class ErrorLecturaDeVuelosException extends Exception {
	
	
	public  ErrorLecturaDeVuelosException (String message) {
		super(message);
	}
	

	public  ErrorLecturaDeVuelosException (Throwable cause) {
		super(cause);
	}
	
	
	public  ErrorLecturaDeVuelosException (String message,Throwable cause) {
		super(message,cause);
	}
	
}
