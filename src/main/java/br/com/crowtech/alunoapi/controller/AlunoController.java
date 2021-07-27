package br.com.crowtech.alunoapi.controller;

import br.com.crowtech.alunoapi.entity.Aluno;
import br.com.crowtech.alunoapi.exceptions.AlunoNotFoundException;
import br.com.crowtech.alunoapi.service.Alunoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v2/aluno")
public class AlunoController {
    @Autowired
    Alunoservice alunoservice;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno createAluno(@RequestBody Aluno aluno){
        return alunoservice.postAluno(aluno);
    }

    @GetMapping
    public List<Aluno> getAlunoList(){
        return alunoservice.getAlunoAll();
    }

    //Retornando os dados do banco pelo ID com uma mensagem personalizada quando ocorrer algum erro
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAlunoByID(@PathVariable("id") Integer id) throws Exception{
        return ResponseEntity.ok(alunoservice.getById(id).orElseThrow(() ->
            new AlunoNotFoundException("Aluno de ID: "+ id + " Não Encontrado")));
    }
    @PutMapping("/{id}")
    public Aluno updateAluno(@RequestBody Aluno aluno){
        return alunoservice.updateAluno(aluno);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteAlunoById(@PathVariable("id") Integer id) throws Exception{
        try{
            alunoservice.deleteAluno(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.noContent().build();
    }

}
