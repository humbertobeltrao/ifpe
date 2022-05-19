package com.ts.ifpe;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pilha<T> {
	
	private ArrayList<T> pilha = new ArrayList<T>();
	private int size = 0;
	
	public void push(T elem) {
		pilha.add(elem);
		size++;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public T pop() throws EmptyStackException {
		if(pilha.isEmpty()) throw new EmptyStackException();
		T rem = pilha.remove(size-1);
		size--;
		return rem;
	}
	
	
	
	
	
	
	
	
	
	
	

}
