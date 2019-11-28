package com.example.demo.resources;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.exceptions.ErrorMessage;
import com.example.demo.exceptions.PersonaIdNotFoundException;

@ControllerAdvice
public class ApiExceptionHandler {

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler({PersonaIdNotFoundException.class})
	@ResponseBody
	public ErrorMessage notFoundRequest(HttpServletRequest request, PersonaIdNotFoundException e) {//se podria mejorar haciendo una exception generica
		
		return new ErrorMessage(e, request.getRequestURI(), e.getDescription());
		//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\":\""+ e.getDescription() +"\"}");
	}
}
