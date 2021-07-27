package br.com.crowtech.alunoapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Enumerated;

@Getter
@AllArgsConstructor
public enum NomeMateria {

    PORTUGUES("Português"),
    MATEMATICA("Matemática"),
    HISTORIA("História"),
    GEOGRAFIA("Geografia");


    private final String descricao;

}
