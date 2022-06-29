package br.com.treinamentojsf.bean.dependent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class TestDependentBean implements Serializable {
	private List<String> personagens;
	private List<String> personagensSelecionados = new ArrayList<String>();

	@PostConstruct
	public void init() {
		System.out.println("Entrou no Post Construct do Dependent Scope");
		personagens = Arrays.asList("Lindinha", "Florzinha", "Docinho");
	}

	public void selecionarPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagensSelecionados.add(personagem);
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

}
