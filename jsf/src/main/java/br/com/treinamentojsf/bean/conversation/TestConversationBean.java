package br.com.treinamentojsf.bean.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class TestConversationBean implements Serializable {
	private List<String> personagens;
	private List<String> personagensSelecionados = new ArrayList<String>();

	@Inject
	private Conversation conversation;

	@PostConstruct
	public void init() {
		System.out.println("Entrou no Postr Construct no View Scope");
		personagens = Arrays.asList("Lindinha", "Florzinha", "Docinho");
		if (conversation.isTransient()) {
			conversation.begin();
			System.out.println("Iniciando conversation scoped, ID=" + conversation.getId());
		}
	}

	public String endConversation() {
		if (!conversation.isTransient()) {
			conversation.end();
		}
		return "conversation?faces-redirect=true";
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

	public Conversation getConversation() {
		return conversation;
	}

	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}

}
