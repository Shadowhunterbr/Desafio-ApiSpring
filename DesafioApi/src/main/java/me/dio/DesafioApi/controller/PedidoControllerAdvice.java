package me.dio.DesafioApi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PedidoControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> erroGernerico(){
		
		Map<String, Object> body = new HashMap<String, Object>();
		
		body.put("message", "ocorreu um erro generico");
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
	}
}
