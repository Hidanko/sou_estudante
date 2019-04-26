package br.com.nemeth.controles;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.nemeth.db.AdministradorDB;
import br.com.nemeth.db.AlunoDB;
import br.com.nemeth.db.LoginDB;
import br.com.nemeth.entidades.Login;
import br.com.nemeth.services.MensagemService;

@Component
@Scope("view")
public class LoginMB {

	@Autowired
	LoginDB loginDB;

	@Autowired
	AdministradorDB administradorDB;

	@Autowired
	AlunoDB alunoDB;
	
	@Autowired
	MensagemService mensagemService;
	
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

	public String validarLogin() {
		mensagemService.displayErrorMessage("TESTE");
		Iterable<Login> todos = loginDB.findAll();
		int cont = 0;
		for (Login login : todos) {
			cont++;
			if (login.getLogin().equals(this.login)) {
				if (login.getSenha().equals(this.senha)) {
					return "pagina_inicial.xhtml";
				} else {
					System.out.println("Senha errada");
					FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERRO", "");
					FacesContext.getCurrentInstance().addMessage(null, facesMessage);
				}
			}
		}
		if (cont == 0) {
			System.out.println("Nenhum login no banco");
		}
		
		System.out.println(cont + " logins no banco");
		
		return "";
	}
}
