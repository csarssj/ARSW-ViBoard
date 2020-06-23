package edu.escuelaing.eci.arsw.viboard.persistence;

public class ViBoardException extends Exception {
	
	private static final long serialVersionUID = 1L;

    public ViBoardException(String message) {
        super(message);
    }

    public ViBoardException(String message, Throwable cause) {
        super(message, cause);
    }

}
