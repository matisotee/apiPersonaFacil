package com.example.demo.exceptions;

public class ErrorMessage {
	
	private String exception;
	private String message;
	private String path;
	
	public ErrorMessage(Exception exception, String path, String msg){
		this.exception = exception.getClass().getSimpleName();
		this.path = path;
		this.message = msg;
	}

	public String getException() {
		return exception;
	}

	public String getMessage() {
		return message;
	}

	public String getPath() {
		return path;
	}
	
	@Override
	public String toString(){
		return "{\"exception\":\""+ getException() +",\"path\":\""+ getPath() + ", \"message\" :\"" + getMessage() + "\" }";
	}
	
}
