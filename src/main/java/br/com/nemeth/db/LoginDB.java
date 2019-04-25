package br.com.nemeth.db;

import org.springframework.data.repository.CrudRepository;

import br.com.nemeth.entidades.Login;


public interface LoginDB extends CrudRepository<Login, String>{

}
