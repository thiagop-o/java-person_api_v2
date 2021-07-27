package br.com.crowtech.alunoapi.controller;

import br.com.crowtech.alunoapi.entity.Aluno;
import br.com.crowtech.alunoapi.service.Alunoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/main")
public class AlunoController {
    @Autowired
    Alunoservice alunoservice;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno createAluno(@RequestBody Aluno aluno){
        return alunoservice.postAluno(aluno);
    }

}
