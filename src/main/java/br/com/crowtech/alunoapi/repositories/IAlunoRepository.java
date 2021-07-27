package br.com.crowtech.alunoapi.repositories;

import br.com.crowtech.alunoapi.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlunoRepository extends JpaRepository<Aluno,Integer> {

}
