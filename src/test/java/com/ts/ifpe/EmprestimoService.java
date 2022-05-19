package com.ts.ifpe;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class EmprestimoService {

	public Emprestimo pegarLivro(Usuario usuario, Livro livro) {
		Emprestimo emp = new Emprestimo();
		emp.setLivro(livro);
		emp.setUsuario(usuario);
		emp.setDataEmp(new Date());
		
		return emp;
		
	}
	
	
}
