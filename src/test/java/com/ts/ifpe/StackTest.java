package com.ts.ifpe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	Stack<Integer> stack;
	
	@Before
	public void init() {
		stack = new Stack<Integer>();
	}

	@Test
	public void testEmptyStack() {
		
		boolean empty = stack.isEmpty();
		assertTrue(empty);
	}
	
	@Test
	public void testStackPush() {
		
		stack.push(3);
		assertFalse(stack.size() == 0);
	}
	
	@Test
	public void testStackPop() {
		
		stack.push(3);
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	
	@Test(expected = java.util.EmptyStackException.class)
	public void testStackPopException() {
		
		//stack.push(3);
		int res = stack.pop();
		res = stack.pop();
	}
}
