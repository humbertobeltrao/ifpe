package com.ts.ifpe;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class EmprestimoServiceTest {

	@Test
	public void empServiceTest() {
		Usuario usuario = new Usuario("Humberto", "1408701");
		Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes");
		EmprestimoService emp = new EmprestimoService();
		
		Emprestimo e = emp.pegarLivro(usuario, livro);
		
		
		assertTrue(e.getLivro().getTitulo().equals("Dom Quixote"));
		assertTrue(e.getUsuario().getNome().equals("Humberto"));
	}
}
