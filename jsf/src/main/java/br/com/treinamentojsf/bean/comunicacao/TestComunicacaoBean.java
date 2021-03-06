package br.com.treinamentojsf.bean.comunicacao;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestComunicacaoBean implements Serializable {

	private String nome;
	private String sobrenome;

	public void imprimirAtributo() {
		String initParameter = FacesContext.getCurrentInstance().getExternalContext()
				.getInitParameter("images.location");
		System.out.println(initParameter);
	}

	public String save() {
		System.out.println(nome);
		System.out.println(sobrenome);
		return "comunicacao2?faces-redirect=true&nome=" + nome + "&sobrenome=" + sobrenome;
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
