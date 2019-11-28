package com.example.demo.exceptions;

public class PersonaIdNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private static final String DEFAULT_DESCRIP = "Person Id not found";
	
	private String description;
	
	public PersonaIdNotFoundException() {
		
		super(DEFAULT_DESCRIP);
		description = DEFAULT_DESCRIP;
		
	}
	
	public PersonaIdNotFoundException(String detail) {
		super(DEFAULT_DESCRIP + ". "+ detail);
		description = DEFAULT_DESCRIP + ". "+ detail;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
