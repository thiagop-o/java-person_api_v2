package br.com.crowtech.alunoapi.exceptions;

public class AlunoNotFoundException extends RuntimeException{
    public AlunoNotFoundException(String message){
        super(message);
    }
    public AlunoNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
