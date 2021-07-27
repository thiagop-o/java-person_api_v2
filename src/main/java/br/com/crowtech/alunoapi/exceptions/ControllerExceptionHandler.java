package br.com.crowtech.alunoapi.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.ServletRequest;

public class ControllerExceptionHandler {
    @ExceptionHandler(AlunoNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(AlunoNotFoundException e, ServletRequest request){
        StandardError err = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}
