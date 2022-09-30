package com.ts.ifpe;

import java.util.ArrayList;
import java.util.EmptyStackException;

//classe com código de sistema
public class Pilha<T> {
	
	private ArrayList<T> pilha;
	private int size;
	
	public Pilha() {
	
		this.pilha = new ArrayList<>();
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public void adiciona(T elemento) {
		pilha.add(elemento);
		this.size++;
	}
	
	public boolean isEmpty() {
		return (pilha.size() == 0);
	}
	
	
	

}
