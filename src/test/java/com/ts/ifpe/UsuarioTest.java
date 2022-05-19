package com.ts.ifpe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {
	
	Usuario usuario;
	
	@Before
	public void init() {
		usuario = new Usuario("Humberto", "1408701");
	}
	
	@Test
	public void getNomeTest() {
		assertTrue(usuario.getNome().equals("Humberto"));
	}
	
	@Test
	public void setNomeTest() {
		String novoNome = "Zé";
		usuario.setNome(novoNome);
		assertFalse(usuario.getNome().equals("Humberto"));
	}
	
	@Test
	public void getMatriculaTest() {
		assertTrue(usuario.getMatricula().equals("1408701"));
	}
	
	@Test
	public void setMatriculaTest() {
		String novaMat = "1408702";
		usuario.setMatricula(novaMat);
		assertTrue(usuario.getMatricula().equals("1408702"));
	}
}
