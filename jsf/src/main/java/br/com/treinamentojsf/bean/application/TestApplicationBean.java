package br.com.treinamentojsf.bean.application;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.treinamentojsf.bean.dependent.TestDependentBean;

@Named
@ApplicationScoped
public class TestApplicationBean implements Serializable {
	private List<String> categoriaList;
	private final TestDependentBean dependentBean;

	@Inject
	public TestApplicationBean(TestDependentBean dependentBean) {
		this.dependentBean = dependentBean;
	}

	@PostConstruct
	public void init() {
		System.out.println("Entrou no Post Construct no Application Scope");
		categoriaList = Arrays.asList("Lindinha", "Florzinha", "Docinho");
		// dependentBean.getCategoriaList().addAll(asList("", "", ""));
	}

	public void mudarLista() {
		categoriaList = Arrays.asList("Ana", "Julia", "Mirella");
	}

	public TestDependentBean getDependentBean() {
		return dependentBean;
	}

	public List<String> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<String> categoriaList) {
		this.categoriaList = categoriaList;
	}

}
