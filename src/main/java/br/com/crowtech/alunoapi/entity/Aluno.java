package br.com.crowtech.alunoapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    private String rA;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataDeNascimento;

    @OneToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST, CascadeType.MERGE , CascadeType.REMOVE})
    private List<Materia> materias;

    public Aluno(String nome, String cpf, String rA, Date dataDeNascimento, List<Materia> materias) {
        this.nome = nome;
        this.cpf = cpf;
        this.rA = rA;
        this.dataDeNascimento = dataDeNascimento;
        this.materias = materias;
    }
}
