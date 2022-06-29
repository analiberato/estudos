package br.com.treinamentojsf.bean.comunicacao;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestComunicacaoBean3 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;

	// @PostConstruct
	public void init() {
		if (!FacesContext.getCurrentInstance().isPostback()) {
			System.out.println("criou comunicação 2");
			// Map<String, String> paramsMap =
			// FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
			// nome = paramsMap.get("nome");
			// sobrenome = paramsMap.get("sobrenome");
			System.out.println(nome);
			System.out.println(sobrenome);
		}

	}

	public String save() {
		System.out.println("Salvando");
		return "resultado?faces-redirect=true&amp;includeViewParams=true";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
