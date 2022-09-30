package com.ts.ifpe;

public class Cliente extends Pessoa {
	
	private double valorDivida;
	private int anoNasc;
	
	
	public Cliente(String nome, String sexo, int idade, double valorDivida, int anoNasc) {
		super(nome, sexo, idade);
		this.valorDivida = valorDivida;
		this.anoNasc = anoNasc;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}


	public int getAnoNasc() {
		return anoNasc;
	}


	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	public String toString() {
		return super.getNome() + super.getSexo() + super.getIdade() + this.anoNasc + this.valorDivida;
	}
	
	
	
	

}
