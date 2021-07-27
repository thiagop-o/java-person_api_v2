package br.com.crowtech.alunoapi.entity;

import br.com.crowtech.alunoapi.enums.NomeMateria;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private NomeMateria materia;

    private String nomeProfessor;

    public Materia(NomeMateria materia, String nomeProfessor) {
        this.materia = materia;
        this.nomeProfessor = nomeProfessor;
    }
}
