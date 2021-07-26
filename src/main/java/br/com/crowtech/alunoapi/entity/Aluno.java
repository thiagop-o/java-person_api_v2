package br.com.crowtech.alunoapi.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Aluno {
    private int id;
    private String nome;
    private String cpf;
    private String rA;
    private Date dataDeNascimento;
    private List<Materia> materias;
}
