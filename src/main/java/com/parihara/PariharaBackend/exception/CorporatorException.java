package com.parihara.PariharaBackend.exception;

public class CorporatorException extends Exception {

	public CorporatorException() {
		
	}
	
	public CorporatorException(String message) {
		super(message);
	}
	
	public CorporatorException(String message, Exception obj) {
		super(message, obj);
	}
}
