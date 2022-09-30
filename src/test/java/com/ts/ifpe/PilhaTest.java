package com.ts.ifpe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

//classe com código de teste
public class PilhaTest {
	
	Pilha<Integer> pilha;
	
	@Before
	public void init() {
		pilha = new Pilha<Integer>();
	}
	
	@Test
	public void sizeTest() {
	
		assertTrue(pilha.size() == 0);
	}
	
		
	@Test
	public void isEmptyTest() {
		assertTrue(pilha.isEmpty());
	}
	
}
