package br.com.nemeth.db;

import org.springframework.data.repository.CrudRepository;

import br.com.nemeth.entidades.Aluno;

public interface AlunoDB extends CrudRepository<Aluno, Integer>{

}
