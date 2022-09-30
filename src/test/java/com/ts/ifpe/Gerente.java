package com.ts.ifpe;

public class Gerente extends Empregado{
	
	private String nomeGerencia;

	
	public Gerente(String nome, String sexo, int idade, String matricula, double salario, String nomeGerencia) {
		super(nome, sexo, idade, matricula, salario);
		this.nomeGerencia = nomeGerencia;
	}

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	public String toString() {
		return super.getNome() + super.getIdade() + this.nomeGerencia + 
				super.valorInss() + super.getMatricula();
	}
	
	
	

}
