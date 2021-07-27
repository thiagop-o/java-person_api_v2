package br.com.crowtech.alunoapi.service;

import br.com.crowtech.alunoapi.entity.Aluno;
import br.com.crowtech.alunoapi.repositories.IAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Alunoservice {
    IAlunoRepository iAlunoRepository;

    @Autowired
    public Alunoservice (IAlunoRepository iAlunoRepository){
        this.iAlunoRepository = iAlunoRepository;
    }

    public Aluno postAluno(Aluno aluno){
        return iAlunoRepository.save(aluno);
    }
}
