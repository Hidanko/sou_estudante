package br.com.nemeth.db;

import org.springframework.data.repository.CrudRepository;

import br.com.nemeth.entidades.Administrador;

public interface AdministradorDB extends CrudRepository<Administrador, Integer>{

}
