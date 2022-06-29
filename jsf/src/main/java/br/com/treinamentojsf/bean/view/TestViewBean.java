package br.com.treinamentojsf.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.treinamentojsf.bean.dependent.TestDependentBean;
import br.com.treinamentojsf.bean.session.TestSessionBean;

@Named
@ViewScoped
public class TestViewBean implements Serializable {
	private List<String> personagens;
	private List<String> personagensSelecionados = new ArrayList<String>();
	private final TestDependentBean dependentBean;
	private final TestSessionBean sessionBean;

	@Inject
	public TestViewBean(TestDependentBean dependentBean, TestSessionBean sessionBean) {
		this.dependentBean = dependentBean;
		this.sessionBean = sessionBean;
	}

	@PostConstruct
	public void init() {
		System.out.println("Entrou no Postr Construct no View Scope");
		personagens = Arrays.asList("Lindinha", "Florzinha", "Docinho");
	}

	public void selecionarPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagensSelecionados.add(personagem);
		dependentBean.getPersonagensSelecionados().add(personagem);
	}

	public List<String> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<String> personagens) {
		this.personagens = personagens;
	}

	public List<String> getPersonagensSelecionados() {
		return personagensSelecionados;
	}

	public void setPersonagensSelecionados(List<String> personagensSelecionados) {
		this.personagensSelecionados = personagensSelecionados;
	}

	public TestDependentBean getDependentBean() {
		return dependentBean;
	}

}
