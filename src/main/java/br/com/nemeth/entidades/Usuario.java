package br.com.nemeth.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuario {

	@Id
	@Basic
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	@Column(name = "senha")
	private String nome;
	@Column(name = "email")
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
