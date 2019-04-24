package br.com.nemeth.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {

	@Id
	@Basic
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	@Column(name = "login", unique = true)
	private String login;

	@Column(name = "senha")
	private String senha;

	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
