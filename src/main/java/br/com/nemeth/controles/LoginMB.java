package br.com.nemeth.controles;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("view")
public class LoginMB {

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
		if (login == "admin" && senha == "admin") {
			return "pagina_inicial";
		}
		return "";
	}
}
