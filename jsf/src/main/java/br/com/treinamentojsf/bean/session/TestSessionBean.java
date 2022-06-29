package br.com.treinamentojsf.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class TestSessionBean implements Serializable {
	private List<String> personagens;
	private List<String> personagensSelecionados = new ArrayList<String>();

	@PostConstruct
	public void init() {
		System.out.println("Entrou no Postr Construct no Session Scope");
		personagens = Arrays.asList("Lindinha", "Florzinha", "Docinho");
	}

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "session?faces-redirect=true";
	}

	public void selecionarPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagensSelecionados.add(personagem);
	}

}
