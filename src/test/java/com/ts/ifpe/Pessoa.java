package com.ts.ifpe;

public class Pessoa {
	
	private String nome;
	private String sexo;
	private int idade;
	
	
	public Pessoa(String nome, String sexo, int idade) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;	
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
