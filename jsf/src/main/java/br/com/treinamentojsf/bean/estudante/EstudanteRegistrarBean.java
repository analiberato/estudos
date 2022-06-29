package br.com.treinamentojsf.bean.estudante;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.treinamentojsf.model.Estudante;

@ManagedBean
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Estudante estudante = new Estudante();
	private String[] nomesArray = { "Ana", "Aninha", "Anano" };
	private List<String> nomesLista = asList("Ana", "Aninha", "Anano");
	private boolean mostrarNotas;

	public String[] getNomesArray() {
		return nomesArray;
	}

	private List<String> asList(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}

	public void executar() {
		System.out.println("executou");
	}

	public String irParaIndex2() {
		return "index2";
	}

	public void exibirNotas() {
		this.mostrarNotas = true;
	}

	public void esconderNotas() {
		this.mostrarNotas = false;
	}

	public boolean isMostrarNotas() {
		return mostrarNotas;
	}

	public List<String> getNomesLista() {
		return nomesLista;
	}

	public void setNomesLista(List<String> nomesLista) {
		this.nomesLista = nomesLista;
	}

	public void setNomesArray(String[] nomesArray) {
		this.nomesArray = nomesArray;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

}
