package br.com.crowtech.alunoapi.exceptions;

import lombok.Data;

import java.io.Serializable;

@Data
public class StandardError implements Serializable {
    private Long timestamp;
    private Integer status;
    private String message;

    public StandardError() {
    }

    public StandardError(Long timestamp, Integer status, String message) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
    }
}
