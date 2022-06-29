package br.com.treinamentojsf.bean.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestRequestBean {
	private List<String> personagens = Arrays.asList("Lindinha", "Florzinha", "Docinho");
	private List<String> personagensSelecionados = new ArrayList<String>();

	@PostConstruct
	public void init() {
		System.out.println("Entrou no Postr Construct no Request Scope");
		personagens = Arrays.asList("Lindinha", "Florzinha", "Docinho");
	}

	public void selecionarPersonagem() {
		int index = ThreadLocalRandom.current().nextInt(3);
		String personagem = personagens.get(index);
		personagensSelecionados.add(personagem);
	}

}
