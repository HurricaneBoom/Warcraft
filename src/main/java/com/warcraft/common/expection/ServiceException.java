package com.warcraft.common.expection;

public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 7793296502722655579L;
 public ServiceException(String message){
	 super(message);
 }

public ServiceException( String message, Throwable cause) {
	super(message, cause);
}
}
