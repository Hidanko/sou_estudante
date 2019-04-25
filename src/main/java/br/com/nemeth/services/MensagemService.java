package br.com.nemeth.services;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Service;

@Service
public class MensagemService {

	public void showMessage(String message, Severity severity) {
		if (message != null) {
			for (String s : message.split("\n")) {
				FacesMessage facesMessage = new FacesMessage(severity, s, "");
				getFacesContext().addMessage(null, facesMessage);
			}
		} else {
			System.out.println("Mensagem nula");
		}
	}

	protected final FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
}
