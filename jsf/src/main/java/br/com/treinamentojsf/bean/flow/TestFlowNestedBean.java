package br.com.treinamentojsf.bean.flow;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped(value = "pendencies")
public class TestFlowNestedBean implements Serializable {
	private String userName;
	private String userNickname;

	public String validarUser() {
		System.out.println("Fazendo a consulta no SERASA");
		System.out.println("Fazendo a consulta no SPC");
		if (true) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não passou nas pendências",
					"Algum detalhe"));
			return null;
		}
		return "proceedToRegistration3";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

}
