package br.com.crowtech.alunoapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Aluno {
    private int id;
    private String nome;
    private String cpf;
    private String rA;
    private Date dataDeNascimento;
    private List<Materia> materias;

    public Aluno(String nome, String cpf, String rA, Date dataDeNascimento, List<Materia> materias) {
        this.nome = nome;
        this.cpf = cpf;
        this.rA = rA;
        this.dataDeNascimento = dataDeNascimento;
        this.materias = materias;
    }
}
