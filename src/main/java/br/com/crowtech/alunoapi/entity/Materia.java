package br.com.crowtech.alunoapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Materia {
    private int id;
    private String materia;
    private String nomeProfessor;

    public Materia(String materia, String nomeProfessor) {
        this.materia = materia;
        this.nomeProfessor = nomeProfessor;
    }
}
