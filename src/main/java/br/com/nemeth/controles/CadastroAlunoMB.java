package br.com.nemeth.controles;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.nemeth.db.AlunoDB;
import br.com.nemeth.db.LoginDB;
import br.com.nemeth.entidades.Aluno;
import br.com.nemeth.entidades.Aluno.Documento;
import br.com.nemeth.entidades.Login;

@Component
@Scope("view")
public class CadastroAlunoMB {

	@PostConstruct
	public void init() {
		setLogin(new Login());
		setAluno(new Aluno());
		documento = null;
	}

	@Autowired
	LoginDB loginDB;

	@Autowired
	AlunoDB alunoDB;

	private Login login;
	private Aluno aluno;
	private Documento documento;

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Documento[] getDocumentos() {
		return Documento.values();
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void cadastrar() {
		login.setUsuario(aluno);
		alunoDB.save(aluno);
		loginDB.save(login);

	}

//	private boolean validarCampos() {
//		List<String> mensagens = new ArrayList<String>();
//
//		if (aluno.getNome() == null) {
//			mensagens.add("Campo NOME não preenchido");
//		} else if (aluno.getNome().length() < 3) {
//		}
//
//		return (mensagens.size() == 0);
//	}
}
