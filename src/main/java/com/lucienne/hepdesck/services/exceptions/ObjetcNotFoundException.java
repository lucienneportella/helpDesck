package com.lucienne.hepdesck.services.exceptions;

public class ObjetcNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjetcNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ObjetcNotFoundException(String message) {
		super(message);
		
	}
	
	

}
