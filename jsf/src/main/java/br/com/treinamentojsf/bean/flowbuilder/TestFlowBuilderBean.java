package br.com.treinamentojsf.bean.flowbuilder;

import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped(value = "newregistration")
public class TestFlowBuilderBean implements Serializable {
	private String nome;
	private String sobrenome;
	private String endereco;

	public void salvar() {
		System.out.println("Salvando no Banco de Dados");
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(endereco);
		// return "exitToInicio";
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

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereco;
	}

}
