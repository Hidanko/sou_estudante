package br.com.nemeth.controles;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.nemeth.db.AdministradorDB;
import br.com.nemeth.db.LoginDB;
import br.com.nemeth.entidades.Login;

@Component
@Scope("view")
public class LoginMB {

	@Autowired
	LoginDB loginDB;

	@Autowired
	AdministradorDB administradorDB;

	private String login;
	private String senha;

	public LoginMB() {
		init();
	}

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

	public void init() {
		this.login = "";
		this.senha = "";
	}

	public String validarLogin(String login, String senha) {

		System.out.println(administradorDB.count());

		Optional<Login> resposta = loginDB.findById(login);

		if (!resposta.isPresent()) {
			System.out.println("Não encontrado");
			return "";
		}
		Login l = resposta.get();
		if (l.getSenha().equals(senha)) {
			return "pagina_inicial";
		}
		System.out.println("Senha inválida");
		return "";
	}
}
