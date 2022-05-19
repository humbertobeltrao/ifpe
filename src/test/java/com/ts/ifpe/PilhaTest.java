package com.ts.ifpe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

public class PilhaTest {
	
	Pilha<Integer> p;
	
	@Before
	public void init() {
		p = new Pilha<Integer>();
	}
	
	@Test
	public void testEmpty() {
		
		assertTrue(p.isEmpty());
	}
	
	@Test
	public void testPush() {
		
		p.push(3);
		assertFalse(p.isEmpty());
	}
	
	@Test
	public void testPop() {
		
		p.push(1);
		p.push(2);
		p.push(3);
		p.pop();
		assertTrue(p.size() == 2);
		
	}
	
	
	
	
}
