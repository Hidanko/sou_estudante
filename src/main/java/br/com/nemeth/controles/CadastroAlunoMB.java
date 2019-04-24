package br.com.nemeth.controles;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.nemeth.entidades.Aluno;
import br.com.nemeth.entidades.Aluno.Documento;

@Component
@Scope("view")
public class CadastroAlunoMB {

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
	
	public void cadastrar() {
		System.out.println("cadastrado");
		System.out.println("nome: "+aluno.getNome());
	}
}
